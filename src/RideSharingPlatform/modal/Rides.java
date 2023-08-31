package RideSharingPlatform.modal;

import java.util.ArrayList;
import java.util.List;

public class Rides {
   private  static Rides rideInstance;
   List<RideDetails> rideDetails;

   public Rides() {
      this.rideDetails = new ArrayList<>();
   }


   // making it singleton
   public static Rides getRideInstance() {
      if(rideInstance == null) {
         rideInstance = new Rides();
      }
      return rideInstance;
   }

}

//- Source: String
////          - destination : String
////            Add Vehical();
////          - Search (Source , destination)
////          - select (Source , destination)
////          - offerRide( vehical , seats , source , destination ); --> User Count;
////          - selectRide() --> 1 /2 only
////                Preferred Vehicle (Activa/Polo/XUV)
////                Most Vacant.
////
////        - Request Ride ( Not sure) --> need to saved in queue
////        - if all the request has ended end ride
////
////        - multiple Ride
//////        - Ride offer
