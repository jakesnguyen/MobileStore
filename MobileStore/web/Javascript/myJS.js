/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


                function openUser(){
                            document.getElementById("userInfo").style.display = "inline-block";
                                    document.getElementById("changePassword").style.display = "none";
                                    document.getElementById("buyingHistory").style.display = "none";
                            }

                            function openChangepassword(){
                            document.getElementById("userInfo").style.display = "none";
                                    document.getElementById("changePassword").style.display = "inline-block";
                                    document.getElementById("buyingHistory").style.display = "none";
                            }

                            function openHistory(){
                            document.getElementById("userInfo").style.display = "none";
                                    document.getElementById("changePassword").style.display = "none";
                                    document.getElementById("buyingHistory").style.display = "inline-block";
                            }