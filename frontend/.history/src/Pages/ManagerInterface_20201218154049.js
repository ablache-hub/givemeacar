import React from 'react'
import StockVehicule from '../Components/StockVehicule';

export default function ManagerInterface() {
    return (
        <div>
            <div className="container rounded mt-5 position-absolute " 
            style={{background: '#FA7E15'}}>
                
                <StockVehicule />
                <label class="switch">
                    <input type="checkbox"/>
                        <span class="slider"></span>
                </label>
            </div>
            </div>
    )
}
