import React, { useState } from "react";
import "./App.css";

function Student(props) {
  return (
    <div className="card">
      <h2>Student Details</h2>
      <p>Name: {props.name}</p>
      <p>Branch: {props.branch}</p>
      <p>College: {props.college}</p>
    </div>
  );
}

function App() {
  const [count, setCount] = useState(0);
  const [name, setName] = useState("");

  return (
    <div className="container">
      <h1>ReactJS Demonstration</h1>

      <Student
        name="Harish"
        branch="CSE"
        college="Vishnu Institute of Technology"
      />

      <div className="card">
        <h2>State Management</h2>
        <h3>Count: {count}</h3>

        <button onClick={() => setCount(count + 1)}>
          Increment
        </button>

        <button onClick={() => setCount(count - 1)}>
          Decrement
        </button>

        <button onClick={() => setCount(0)}>
          Reset
        </button>
      </div>

      <div className="card">
        <h2>Event Handling</h2>

        <input
          type="text"
          placeholder="Enter your name"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />

        <h3>Hello, {name || "Guest"}!</h3>
      </div>
    </div>
  );
}

export default App;
