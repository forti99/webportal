const showAllMitglieder = (event) => {
    event.preventDefault();
    $.get("http://localhost:8080/mitglied/alleAbrufen", null, function (data) {
        var mainContainer = document.getElementById("mitglieder");
        var saveTr = mainContainer.firstElementChild;
        mainContainer.innerHTML = "";
        mainContainer.appendChild(saveTr);
        for (var i = 0; i < data.length; i++) {
            var tr = document.createElement("tr");
            var td1 = document.createElement("td");
            var td2 = document.createElement("td");
            var td3 = document.createElement("td");
            var td4 = document.createElement("td");
            td1.innerHTML = data[i].vorname;
            td2.innerHTML = data[i].name;
            td3.innerHTML = data[i].alter;
            td4.innerHTML = data[i].adresse;
            mainContainer.appendChild(tr);
            tr.appendChild(td1);
            tr.appendChild(td2);
            tr.appendChild(td3);
            tr.appendChild(td4);
        }
        console.log(data)
    })
}

function hideAllMitglieder() {
    document.getElementById("mitglieder").innerHTML = "";
}

document.getElementById('getAllMitglieder').addEventListener('click', showAllMitglieder);
document.getElementById('hideAllMitglieder').addEventListener('click', hideAllMitglieder);