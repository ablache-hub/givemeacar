import Agence from './Components/Agence'
import Header from './Components/Header'
import AffichageAgence from './Components/AffichageAgence'
import AddVehiculePopup from './Components/AddVehiculePopup'
import ProfilManager from "./Components/ProfilManager"
import ManagerInterface from './Pages/ManagerInterface'
import './Style/style.scss'
import StockVehicule from './Components/StockVehicule'

function App() {
    return (
        <div className="App position-relative">
            {/* <Agence /> */}
            <Header/>
            <StockVehicule/>
            {/* <ManagerInterface/> */}
            {/* <AddVehiculePopup/> */}
            {/* <ProfilManager/> */}
        </div>
    );
}

export default App;
