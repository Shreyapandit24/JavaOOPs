package org.oopsdata.sppu.login.finalkeyword;

public class WhatsappService {

	Whatsapp w1=new Whatsapp();
	MetaWhatsapp m1=new MetaWhatsapp();
	
	void getService() {
		m1.setVideoCalling("Upgraded Video Calling");
		m1.setStatusUpdation("Status Uploadation ");
		m1.setBulkfileUpload("Transfer Bulk Files ");
		m1.setCreateGroups("Cam Create Groups now");
		m1.sethDPhotoVideo("Can Transfer HD Photos and Videos");
		m1.setPayments("Can Transfer Monney now");
		System.out.println(w1.getVoicecalling());
		System.out.println(w1.getInternetChatting());
		System.out.println(m1.getVideoCalling());
		System.out.println(m1.getBulkfileUpload());
		System.out.println(m1.getCreateGroups());
		System.out.println(m1.gethDPhotoVideo());
		System.out.println(m1.getStatusUpdation());
		System.out.println(m1.getPayments());

	}
	
}
