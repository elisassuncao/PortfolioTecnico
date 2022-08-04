public class MainActivity extends AppCompatActivity {
    EditText javackson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        javackson = findViewById(R.id.buscar);
    }

    public void botaoWiki(View v){
        String buscar = javackson.getText().toString();
        String link = "https://pt.wikipedia.org/wiki/"+buscar;
        Intent i = new Intent(this, TelaWeb.class);
        startActivity(i);
        TelaWeb.link = link;

    }
}


public class TelaWeb extends AppCompatActivity {
    WebView wv;
    static String link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_web);
        getSupportActionBar().hide();
        wv = findViewById(R.id.web);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl(link);

    }
}
