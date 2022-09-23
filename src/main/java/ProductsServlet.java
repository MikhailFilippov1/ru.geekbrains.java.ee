import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "ProductsServlet", urlPatterns = "/products")
public class ProductsServlet implements Servlet {
    private transient ServletConfig servletConfig;
    private static Logger logger = LoggerFactory.getLogger(ProductsServlet.class);

    List<Product> productList = new ArrayList<>(Arrays.asList(new Product(1L, "Milk", 10),
            new Product(2L, "Bread", 5),
            new Product(3L, "Butter", 20),
            new Product(4L, "Potato", 3),
            new Product(5L, "Apple", 5),
            new Product(6L, "Meet", 30),
            new Product(7L, "Egg", 2),
            new Product(8L, "Ketchup", 10),
            new Product(9L, "Spaghetti", 7),
            new Product(10L, "Salt", 1)));

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        logger.info("Start: ");
        servletResponse.getWriter().println(productList.toString());
        logger.info("Done: ");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
