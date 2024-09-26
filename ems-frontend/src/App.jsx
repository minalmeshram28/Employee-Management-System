import "./App.css";
import FooterComponent from "./components/FooterComponent";
import HeaderComponent from "./components/HeaderComponent";
import ListEmployeeComponent from "./components/ListEmployeeComponent";
import AddEmployeeComponent from "./components/AddEmployeeComponent";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";

function App() {
  return (
    <>
      <Router>
        <HeaderComponent />
        <Routes>
          <Route path="/" element={<ListEmployeeComponent />}></Route>
          <Route path="/employees" element={<ListEmployeeComponent />}></Route>
          <Route
            path="/add-employee"
            element={<AddEmployeeComponent />}
          ></Route>
          <Route
            path="/edit-employee/:id"
            element={<AddEmployeeComponent />}
          ></Route>
        </Routes>
        <FooterComponent />
      </Router>
    </>
  );
}

export default App;
