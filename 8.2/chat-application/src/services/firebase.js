import firebase from "firebase/app";
import "firebase/auth";
import "firebase/database";
const config = {
    apiKey: "AIzaSyBFyjOsUUXTy1YpZboB510givuPRy5lnFY",
    authDomain: "chat-application-1789f.firebaseapp.com",
    databaseURL: "https://chat-application-1789f-default-rtdb.firebaseio.com/"
  };

  firebase.initializeApp(config);
  
  export const auth = firebase.auth;
  export const db = firebase.database();