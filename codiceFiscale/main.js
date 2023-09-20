const nome = document.getElementById("nome");
const cognome = document.getElementById("cognome");
const sesso = document.getElementById("sesso");
const luogo = document.getElementById("luogo");
const giorno = document.getElementById("giorno");
const mese = document.getElementById("mese");
const anno = document.getElementById("anno");
const codicefiscale = document.getElementById("codicefiscale");
const btninvio = document.getElementById("btninvio");


var luoghi =["brescia", "milano", "roma", "napoli" ];
var codiceLuogo = ["B157", "F205", "H501", "F839"]; 
var mesi =["gennaio", "febbraio", "marzo", "aprile", "maggio", "giugno", "luglio", "agosto", "settembre", "ottobre", "novembre", "dicembre"]; 
var letteraMesi= ["A", "B", "C", "D", "E", "H", "L", "M", "P", "R", "S", "T"];

btninvio.addEventListener("click", () => {
    const nomeValue = nome.value.toUpperCase();
    const cognomeValue = cognome.value.toUpperCase();
    const sessoValue = sesso.value;
    const luogoValue = luogo.value.toUpperCase();
    const dataValue = `${anno.value}-${mese.value}-${giorno.value}`;
    const codiceFiscale = calcolaCodiceFiscale(nomeValue,cognomeValue,sessoValue,dataValue,luogoValue);
    risultato.innerHTML = codiceFiscale;
    console.log(codiceFiscale);
});

let calcolaCodiceFiscale = (nome, cognome, sesso, data, luogo) => {
    const codiceCognome = calcolaCodiceCognome(cognome);
    const codiceNome = calcolaCodiceNome(nome);
    const codiceAnno = calcolaCodiceAnno(data);
    const codiceMese = calcolaCodiceMese(data);
    const codiceGiorno = calcolaCodiceGiorno(data, sesso);
    const codiceLuogo = calcolaCodiceLuogo(luogo);
    const codiceControllo = calcolaCodiceControllo(codiceCognome,codiceNome,codiceAnno,codiceMese,codiceGiorno,codiceLuogo);
    return codiceCognome + codiceNome + codiceAnno + codiceMese + codiceGiorno + codiceLuogo + codiceControllo;

};

const calcolaCodiceCognome = (cognome) => {
    return cognome.replace(/[aeiou]/gi, " ");
};

const getLettere = (consonanti, vocali) => {
    if (consonanti.length > 3) {
        return `${consonanti[0]}${consonanti[2]}${consonanti[3]}`;
    } else {
        return `${consonanti}${vocali}X`;
    }
};

const calcolaCodiceNome = (nome) => {
    return nome.replace(/[aeiou]/gi, " ");
    
};

const calcolaCodiceAnno = (data) => {
    const anno = data.slice(2, 4);
    return anno;
};

const calcolaCodiceMese = (data) => {
    const mese = data.slice(5, 7) - 1;
    return letteraMesi[mese];
};
const calcolaCodiceGiorno = (data, sesso) => {
    const giorno = parseInt(data.slice(8, 10));
    if (sesso === "M") {
        return giorno;
    } else {
        return giorno + 40;
    }
};


const calcolaCodiceLuogo = (luogo) => {
    const index = luoghi.findIndex((nome) =>
        nome.toUpperCase() === luogo.toUpperCase()
    );

    if (index !== -1) {
        return codiceLuogo[index];
    } else {
        return "";
    }
};

const calcolaCodiceControllo = (codiceCognome,codiceNome,codiceAnno,codiceMese,codiceGiorno,codiceLuogo) => {
    const caratteri = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';

    const charMap = {};
    for (let i = 0; i < caratteri.length; i++) {
        charMap[caratteri.charAt(i)] = i;
    }

    const dati = codiceCognome + codiceNome + codiceAnno + codiceMese + codiceGiorno + codiceLuogo;

    let c = 0;
    for (let i = 0; i < dati.length; i++) {
        let char = dati.charAt(i);

        if (i % 2 === 0) {
            let value = charMap[char] * 2;
            if (value > 9) {
                value -= 9;
            }
            c += value;
        } else {
            c += charMap[char];
        }
    }
}

