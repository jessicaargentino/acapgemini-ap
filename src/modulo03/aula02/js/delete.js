function remove(event) {
    event.preventDefault();
    let id = document.getElementById('id');

    travel = { "id": id.value };
    let group_travel = JSON.parse(localStorage.getItem("travel"));
    let valid_id;

    for (let i = 0; i < group_travel.length; i++) {
        if (group_travel[i].id.value == travel.id.value) {
            localStorage.removeItem('travel'[i])
            alert('Cadastro excluído com sucesso')
        } else {
            alert('ID não encontrado, não foi possível excluir!')
        }
    }

    // if (valid_id) {
    //     localStorage.removeItem('travel');
    //    alert('Cadastro excluído com sucesso!')
    // } else {
    //    alert('ID não encontrado, não foi possível excluir!')
    //}
}