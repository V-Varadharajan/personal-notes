// SPDX-License-Identifier: MIT

pragma solidity ^0.8.26;

//
// contract Input_passing {
//     string n1; //state variable 
//     uint n2;

//     // constructor(string memory _n1, uint _n2) {
//     //     n1 = _n1;
//     //     n2 = _n2;
//     // }

//     function addValue(string memory _n1, uint _n2) public {
//         n1 = _n1;
//         n2 = _n2;
//     }

//Sample program on solidity with NFT count
contract Input_passing {
    uint256 public NFT;

    function addNFT() public {
        NFT = NFT + 1;
    }

    function deleteNFT() public {
        NFT = NFT - 1;
    }

    function showNFT() public view returns(uint) {
        return NFT;
    }
}
