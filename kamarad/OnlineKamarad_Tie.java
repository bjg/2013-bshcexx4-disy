package kamarad;


/**
* kamarad/OnlineKamarad_Tie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from kamarad.idl
* Wednesday, March 5, 2014 10:00:42 AM GMT
*/

public class OnlineKamarad_Tie extends _OnlineKamaradImplBase
{

  // Constructors
  public OnlineKamarad_Tie ()
  {
  }

  public OnlineKamarad_Tie (kamarad.OnlineKamaradOperations impl)
  {
    super ();
    _impl = impl;
  }

  public void register (kamarad.KamaradAccountDetails accountDetails, org.omg.CORBA.AnyHolder uniqueId)
  {
    _impl.register(accountDetails, uniqueId);
  } // register

  public void getAccountDetails (int uniqueId, kamarad.KamaradAccountDetailsHolder accountDetails)
  {
    _impl.getAccountDetails(uniqueId, accountDetails);
  } // getAccountDetails

  public void topupAccount (int uniqueId, double amount)
  {
    _impl.topupAccount(uniqueId, amount);
  } // topupAccount

  private kamarad.OnlineKamaradOperations _impl;

} // class OnlineKamarad_Tie