window.onload = function () {
    let tbody = document.getElementById("travels");
    let group_travel = JSON.parse(localStorage.getItem("travel"));
    console.log(group_travel)
    tbody.innerHTML = "";
    group_travel.forEach(gp => {
        tbody.innerHTML += "<tr>"
            + "<td>" + gp['id'] + "</td>"
            + "<td>" + gp['city'] + "</td>"
            + "<td>" + gp['state'] + "</td>"
            + "<td>" + gp['price'] + "</td>"
            + "<td>" + gp['departure'] + "</td>"
            + "<td>" + gp['regress'] + "</td>"
            + "</tr>";
    });
}