import { useState } from "react";
import Button, { Colour } from "./components/Button";
import "./App.css";

function App() {

  const [counter, setCounter] = useState<number>(0);

  //const [user, setUser] = useState<User | null>(null);

  const increment = (e: React.MouseEvent<HTMLElement>) => {
    e.preventDefault;
    setCounter(counter +1)
  };

  const decremet = () => {
    setCounter(counter -1);
  };

 const onSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
  }

  if (!user) {
    return <h1>Loading</h1>
  }

  return (
      <>
      <h1 onClick={() => increment(2)}>{counter}</h1>
      <Button size="large" colour={Colour.RED} text="Decrement" onClick={decremet} />
      <Button
      size="small"
      colour={Colour.GREEN}
      text="Increment"
      borderColour={Colour.BLUE}
      onClick={increment}
      />
      </>
      );
}

export default App;
