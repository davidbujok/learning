import { useEffect, useState } from "react";
import BiscuitList from "../components/BiscuitList";
import TeaList from "../components/TeaList";
import TeaBiscuitForm from "../components/TeaBiscuitForm";

const TeasContainer = () => {
  const [teas, setTeas] = useState([]);
  const [biscuits, setBiscuits] = useState([]);
  const BASE_URL = "http://localhost:8080";

  useEffect(() => {
    fetchTeas();
    fetchBiscuits();
  }, []);

  const fetchTeas = () => {
    fetch(BASE_URL + "/api/teas")
      .then((response) => response.json())
      .then((teas) => setTeas(teas));
  };

  const fetchBiscuits = () => {
    fetch(BASE_URL + "/api/biscuits")
      .then((response) => response.json())
      .then((biscuits) => setBiscuits(biscuits));
  };

  const handleTeaSubmit = (newTea) => {
    fetch(BASE_URL + "/api/teas", {
      method: "POST",
      body: JSON.stringify(newTea),
      headers: { "Content-Type": "application/json" },
    }).then(() => fetchTeas());
  };

  const handleBiscuitSubmit = (newBiscuit) => {
    fetch(BASE_URL + "/api/biscuits", {
      method: "POST",
      body: JSON.stringify(newBiscuit),
      headers: { "Content-Type": "application/json" },
    }).then(() => fetchBiscuits());
  };

  const handleDeleteBiscuit = (biscuit_id) => {
    fetch(BASE_URL + "/api/biscuits/" + biscuit_id, { 
      method: "DELETE" })
      .then(() => fetchBiscuits());
  };
  
  const handleDeleteTea = (tea_id) => {
    fetch(BASE_URL + "/api/teas/" + tea_id, { 
      method: "DELETE" })
      .then(() => fetchTeas());
  };
  const handleTeaUpdate = (tea) => {
    fetch(BASE_URL + "/api/teas/" + tea.id, {
      method: "PUT",
      body: JSON.stringify(tea),
      headers: { "Content-Type": "application/json" },
    }).then(() => fetchTeas());
    }
  
  return (
    <>
      <TeaBiscuitForm
        onTeaSubmit={handleTeaSubmit}
        onBiscuitSubmit={handleBiscuitSubmit}
      />
      <TeaList teas={teas}
        handleDeleteTea={handleDeleteTea}
        handleTeaUpdate={handleTeaUpdate}
       />

      <BiscuitList 
        biscuits={biscuits}
        handleDeleteBiscuit={handleDeleteBiscuit}
      />
    </>
  );
}

export default TeasContainer;
