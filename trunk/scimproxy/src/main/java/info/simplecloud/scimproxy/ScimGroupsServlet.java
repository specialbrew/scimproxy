package info.simplecloud.scimproxy;

import java.io.IOException;
import javax.servlet.http.*;

/*

GET:
curl -i -H "Accept: application/json" http://localhost:8080/Groups

 */

@SuppressWarnings("serial")
public class ScimGroupsServlet extends RestServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setStatus(HttpServletResponse.SC_NOT_IMPLEMENTED);
	}

}