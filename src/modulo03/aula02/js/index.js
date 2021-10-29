function inicialize(event) {
    event.preventDefault();
    var travel = []
    localStorage.setItem("travel", JSON.stringify(travel));
}