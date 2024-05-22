import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPrice;
    private Spinner spinnerCategory;
    private RecyclerView recyclerViewProducts;

    private List<Product> productList;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        editTextPrice = findViewById(R.id.editTextPrice);
        spinnerCategory = findViewById(R.id.spinnerCategory);
        recyclerViewProducts = findViewById(R.id.recyclerViewProducts);

        // Initialize product list
        productList = new ArrayList<>();

        // Initialize RecyclerView
        productAdapter = new ProductAdapter(productList);
        recyclerViewProducts.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewProducts.setAdapter(productAdapter);

        // Dummy data (replace with API data)
        productList.add(new Product("iPhone 9", "An apple mobile which is nothing like apple", 549, "Apple", "Smartphones"));
        productList.add(new Product("Samsung Universe 9", "Samsung's new variant", 599, "Samsung", "Smartphones"));
        productList.add(new Product("Samsung Galaxy Book", "Samsung Galaxy Book S (2020) Laptop", 1499, "Samsung", "Laptops"));
        productList.add(new Product("Microsoft Surface Laptop 4", "Style and speed", 1499, "Microsoft", "Laptops"));
        // Add more products as needed

        // Set up spinner with dummy categories (replace with API categories)
        List<String> categories = new ArrayList<>();
        categories.add("All"); // Add "All" option
        categories.add("Smartphones");
        categories.add("Laptops");
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCategory.setAdapter(spinnerAdapter);
    }
}
