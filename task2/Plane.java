public class Plane{
private int planeID;
private int placesCount;
private Route route;
public Plane (int planeID, int placesCount, Route route){
this.planeID = planeID;
this.placesCount = placesCount;
this.route=route;
System.out.println("PLANE");
}
public int getPlaneID(){
return planeID;
}
public int getPlacesCount(){
return placesCount;
}
public Route getRoute(){
return route;
}
public void setPlaneID(int planeID){
this.planeID = planeID;
}
public void setPlacesCount(int placesCount){
this.placesCount = placesCount;
}
public void setRoute(Route route){
this.route = route;
}
}
