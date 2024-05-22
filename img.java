import com.squareup.picasso.Picasso;

// Inside your activity or fragment
String imageUrl = "https://cdn.dummyjson.com/product-images/1/thumbnail.jpg";
ImageView imageView = findViewById(R.id.imageView); // Assuming you have an ImageView with id "imageView" in your layout
Picasso.get().load(imageUrl).into(imageView);
