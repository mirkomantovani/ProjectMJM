package it.polimi.ingsw.ps19.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import it.polimi.ingsw.ps19.command.ServerToClientCommand;

public class ClientHandlerSocket extends ClientHandler{

	
	private Socket socket;
	private ObjectInputStream inSocket;
	private ObjectOutputStream outSocket;
	private int clientNumber;
	private ServerInterface creator;
	
	public ClientHandlerSocket(Socket socket, int number,
			ServerInterface serverStarter) {
//		allower = null;
		clientNumber = number;
		this.socket = socket;
//		code = hashCode();
		creator = serverStarter;
		closed = false;
		try {
			inSocket = new ObjectInputStream(this.socket.getInputStream());
			outSocket = new ObjectOutputStream(this.socket.getOutputStream());
			outSocket.flush();
		} catch (IOException e) {
			closedByServer();
		}

	}
	
	
	@Override
	public void sendCommand(ServerToClientCommand command) throws IOException {
		outSocket.writeObject(command);
		outSocket.flush();
		outSocket.close();
	}

	@Override
	public void closedByServer() {
		
	}

	@Override
	public void closedByClient() {
		
	}

	@Override
	public boolean isClosed() {
		return false;
	}
	
//	private void close() {
////		if (!closed) {
////			try {
////				closed = true;
//		try{
//				this.socket.close();
//				this.inSocket.close();
//				this.outSocket.close();
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		
//	}


	@Override
	public void Close() {
		try{
			this.socket.close();
			this.inSocket.close();
			this.outSocket.close();
	}catch(Exception e){
		e.printStackTrace();
	}		
	}

}