
 var io = require("socket.io").listen(999);

 io.sockets.on("connection", function(socket) {
     console.log("connected!")

    //  socket.emit("Msg",function(data){
    //      console.log(data);
    //      socket.emit("MsgRes",data);
    //  });
    data = "전송했음";
    socket.emit("MsgRes",data);
 });