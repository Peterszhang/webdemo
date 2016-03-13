package chapter4;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowImage extends HttpServlet
{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
        response.setContentType("image/jpeg");  // 设置响应信息的类型
        OutputStream os = response.getOutputStream();
        byte[] buffer = new byte[8192];

        String imageName = request.getParameter("name");  // 获得name所指定的图象名
        FileInputStream fis = new FileInputStream(imageName);
        int count = 0;
        while (true)    // 开始读取并传送name所指定的的图象数据
        {
            count = fis.read(buffer);
            if (count <= 0)
                break;
            os.write(buffer, 0, count);
        }
        fis.close();
	}

}
