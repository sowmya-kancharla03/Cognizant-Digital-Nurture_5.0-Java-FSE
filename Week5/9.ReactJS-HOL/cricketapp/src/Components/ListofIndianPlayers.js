import React from "react";

function ListofIndianPlayers(props) {
    return (
        <>
            {
                props.IndianPlayers.map((player, index) => (
                    <div key={index}>
                        <li>Mr. {player}</li>
                    </div>
                ))
            }
        </>
    );
}

export default ListofIndianPlayers;