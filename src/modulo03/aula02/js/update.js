function update(event) {
    event.preventDefault();

    let id = document.getElementById('id');
    let city = document.getElementById('city');
    let state = document.getElementById('state');
    let price = document.getElementById('price');
    let departure = document.getElementById('departure');
    let regress = document.getElementById('regress');

    travel = {
        "id": id.value,
        "city": city.value,
        "state": state.value,
        "price": price.value,
        "departure": departure.value,
        "regress": regress.value
    };

    let group_travel = JSON.parse(localStorage.getItem("travel"));
    let valid_id;

    for (let n = 0; n < group_travel.length; n++) {
        if (group_travel[n].id.value == travel.id.value) {
            group_travel.push(travel);
            group_travel[n] = localStorage.setItem("travel", JSON.stringify(group_travel));
            alert('Alteração realizada com sucesso!')
            valid_id = true;
        } else {
            valid_id = false;
        }
    }

    if (price.value <= 0) {
        alert('O valor não pode ser menor ou igual a R$0,00!')
    }
    if (!valid_id) {
        alert('ID não encontrado, não foi possível alterar!')
    }
    console.log(group_travel.length)
}