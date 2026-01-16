const gameBoard = document.getElementById('game-board');
const resetBtn = document.getElementById('reset-btn');

const emojis = ['🍎', '🍌', '🍇', '🍓', '🍒', '🥝', '🍍', '🍑'];
let cards = [...emojis, ...emojis];
let flippedCards = [];
let matchedCount = 0;
let lockBoard = false;

function shuffle(array) {
    for (let i = array.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [array[i], array[array[j] === undefined ? i : j]] = [array[j], array[i]];
    }
    return array;
}

function createCard(emoji) {
    const card = document.createElement('div');
    card.classList.add('card');
    card.dataset.emoji = emoji;

    card.innerHTML = `
        <div class="card-face card-front">?</div>
        <div class="card-face card-back">${emoji}</div>
    `;

    card.addEventListener('click', flipCard);
    return card;
}

function flipCard() {
    if (lockBoard) return;
    if (this === flippedCards[0]) return;
    if (this.classList.contains('matched')) return;

    this.classList.add('flipped');
    flippedCards.push(this);

    if (flippedCards.length === 2) {
        checkMatch();
    }
}

function checkMatch() {
    lockBoard = true;
    const [card1, card2] = flippedCards;
    const isMatch = card1.dataset.emoji === card2.dataset.emoji;

    if (isMatch) {
        disableCards();
    } else {
        unflipCards();
    }
}

function disableCards() {
    const [card1, card2] = flippedCards;
    
    // Add matched class to trigger disappearance in CSS
    setTimeout(() => {
        card1.classList.add('matched');
        card2.classList.add('matched');
        
        matchedCount += 2;
        resetFlippedCards();
        
        if (matchedCount === cards.length) {
            setTimeout(() => alert('Congratulations! You matched all pairs!'), 600);
        }
    }, 500);
}

function unflipCards() {
    setTimeout(() => {
        flippedCards.forEach(card => card.classList.remove('flipped'));
        resetFlippedCards();
    }, 1000);
}

function resetFlippedCards() {
    flippedCards = [];
    lockBoard = false;
}

function initGame() {
    gameBoard.innerHTML = '';
    matchedCount = 0;
    flippedCards = [];
    lockBoard = false;
    
    const shuffledCards = shuffle([...cards]);
    shuffledCards.forEach(emoji => {
        const card = createCard(emoji);
        gameBoard.appendChild(card);
    });
}

resetBtn.addEventListener('click', initGame);

// Initial start
initGame();
