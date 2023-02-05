const renteBerechnen = (event) => {
    event.preventDefault();
    let alter = parseInt(document.getElementById("alter").value);
    let beitrag = parseFloat(document.getElementById("beitrag").value);
    let eintrittsalter = parseInt(document.getElementById("eintrittsalter").value);

    $.get(`http://localhost:8080/rechner/${alter}/${beitrag}/${eintrittsalter}`, null, function (data) {
        document.getElementById("ergebnisRente").value = data;
        console.log(data);
    })
}

document.getElementById('beitragBerechnen').addEventListener('click', renteBerechnen);