package examples.Working_With_Folder;

import com.groupdocs.cloud.signature.api.*;
import com.groupdocs.cloud.signature.client.ApiException;
import com.groupdocs.cloud.signature.model.requests.*;
import examples.Utils;

public class Signature_Java_Signature_Java_Copy_Folder {

	public static void main(String[] args) {

		FolderApi apiInstance = new FolderApi(Utils.AppSID, Utils.AppKey);
		try {
			CopyFolderRequest request = new CopyFolderRequest("Signaturedocs", "Signaturedocs1", Utils.MYStorage,
					Utils.MYStorage);
			apiInstance.copyFolder(request);
			System.out.println("Expected response type is Void: 'Signaturedocs' folder copied as 'Signaturedocs1'.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FolderApi:");
			e.printStackTrace();
		}
	}
}