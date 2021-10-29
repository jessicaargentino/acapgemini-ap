function create(event) {
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
    let invalid_id;

    group_travel.forEach(gp => {
        if (gp.id == travel.id) {
            invalid_id = true;
        } else {
            invalid_id = false;
        }
    });

    if (invalid_id) {
        alert('ID existente!')
    } else if (price.value <= 0) {
        alert('O valor não pode ser menor ou igual a R$0,00!')
    } else {
        group_travel.push(travel);
        localStorage.setItem("travel", JSON.stringify(group_travel));
        alert('Cadastro criado com sucesso!')
    }
}