using UnityEngine;
using SocketIOClient;
using socket.io;
using System;
using System.Collections;


    public class serverC : MonoBehaviour //SocketManager
    {
        string url = "http://127.0.0.1:999/";
        public static Client Socket { get; private set; }

        void Awake()
        {
            Socket = new Client(url);
            Socket.Opened += SocketOpened;
            Socket.Connect();

        Socket.On("MsgRes", (data) =>
        {
            //Debug.Log(data.Json.args[0]);
            Debug.Log(data.Json.args[0]);
            Debug.Log("데이터 전송");
        });
    }

        private void SocketOpened(object sender, System.EventArgs e)
        {
            Debug.Log("Socket Opened");
        }

        void OnDisable()
        {
            Socket.Close();
        }

    //void Start()
    //{
    //    try
    //    {
    //        Socket.On("MsgRes", (data) =>
    //        {
    //                    Debug.Log(data.Json.args[0]);
    //        });
    //    }
    //    catch (NullReferenceException ex)
    //    {
    //        Debug.Log("ex errorㅠㅠ");
    //    }
        
    //}
}