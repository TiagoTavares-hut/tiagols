window.addEventListener('DOMContentLoaded', () => {
    const compassArrow = document.getElementById('compass-arrow');
    const compassReadout = document.getElementById('compass-readout');
    const levelBubble = document.getElementById('level-bubble');
    const levelReadout = document.getElementById('level-readout');
    const unsupportedMessage = document.getElementById('unsupported-message');
    const appContainer = document.getElementById('app');

    const compassContainer = document.getElementById('compass-container');
    const levelContainer = document.getElementById('level-container');
    const showCompassBtn = document.getElementById('show-compass');
    const showLevelBtn = document.getElementById('show-level');

    let hasSensorSupport = false;

    // Função para a Bússola
    function handleOrientation(event) {
        if (event.webkitCompassHeading) { // Para iOS
            const heading = event.webkitCompassHeading;
            compassArrow.style.transform = `rotate(${heading}deg)`;
            compassReadout.textContent = `${Math.round(heading)}°`;
            hasSensorSupport = true;
        } else if (event.alpha !== null) { // Padrão
            const heading = 360 - event.alpha; // alpha é 0-360, mas na direção oposta
            compassArrow.style.transform = `rotate(${heading}deg)`;
            compassReadout.textContent = `${Math.round(heading)}°`;
            hasSensorSupport = true;
        }
        checkSupport();
    }

    // Função para o Nível
    function handleMotion(event) {
        const { beta, gamma } = event.rotationRate ? event.rotationRate : event; // Beta (X), Gamma (Y)
        if (beta !== null && gamma !== null) {
            // Limita o movimento da bolha para dentro do círculo
            const x = Math.max(-90, Math.min(90, gamma));
            const y = Math.max(-90, Math.min(90, beta));
            
            levelBubble.style.transform = `translate(${x}px, ${y}px)`;
            levelReadout.textContent = `X: ${Math.round(x)}° | Y: ${Math.round(y)}°`;
            hasSensorSupport = true;
        }
        checkSupport();
    }

    // Verifica se os sensores são suportados e mostra a mensagem apropriada
    function checkSupport() {
        if (!hasSensorSupport) {
            unsupportedMessage.style.display = 'block';
            compassContainer.style.display = 'none';
            levelContainer.style.display = 'none';
            document.querySelector('.navigation').style.display = 'none';
        } else {
            unsupportedMessage.style.display = 'none';
        }
    }

    // Adiciona os listeners dos eventos
    if (window.DeviceOrientationEvent) {
        window.addEventListener('deviceorientation', handleOrientation);
    }
    if (window.DeviceMotionEvent) {
        window.addEventListener('devicemotion', handleMotion);
    }

    // Lógica de navegação
    showCompassBtn.addEventListener('click', () => {
        levelContainer.classList.remove('active');
        compassContainer.classList.add('active');
        showLevelBtn.classList.remove('active');
        showCompassBtn.classList.add('active');
    });

    showLevelBtn.addEventListener('click', () => {
        compassContainer.classList.remove('active');
        levelContainer.classList.add('active');
        showCompassBtn.classList.remove('active');
        showLevelBtn.classList.add('active');
    });

    // Verificação inicial de suporte após um pequeno atraso
    setTimeout(checkSupport, 1000);
});
