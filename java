body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    margin: 0;
}

.container {
    background: white;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
    width: 300px;
}

h1 {
    text-align: center;
}

form {
    display: flex;
    justify-content: space-between;
}

form input {
    flex: 1;
    padding: 5px;
    margin-right: 10px;
}

form button {
    padding: 5px 10px;
}

ul {
    list-style: none;
    padding: 0;
}

li {
    display: flex;
    justify-content: space-between;
    padding: 5px 0;
}

li.completed {
    text-decoration: line-through;
    color: gray;
}
