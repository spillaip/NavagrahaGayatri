package vaishnavism.eclass.navagrahagayatri;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Sloka> slokas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slokas.add(new Sloka("சூரிய காயத்ரி\n\nஓம் அஸ்வத்வஜாய வித்மஹே\nபாஸ அஸ்தாய தீமஹி\nதன்னோ சூர்ய ப்ரசோதயாத்\n", "Surya Gayatri\n\nOm Aswadwajaya Vidhmahe\nPasa Hasthaya Dheemahe\nThanno Surya Prachodayath","suryan"));
        slokas.add(new Sloka("சந்திர காயத்ரி\n\nஓம் பத்மத்வஜாய வித்மஹே\nபஹேம ரூபாய தீமஹி\nதன்னோ ஸோம ப்ரசோதயாத்\n", "Chandra Gayatri\n\nOm Padmadwajaya Vidhmahe\nHema roopaya Dheemahe\nThanno Chandra Prachodayath","chandran"));
        slokas.add(new Sloka("செவ்வாய் காயத்ரி\n\nஓம் வீரத்வஜாய வித்மஹே\nவிக்ன அஸ்தாய தீமஹி\nதன்னோ பெளம ப்ரசோதயாத்\n", "Angaraka Gayatri\n\nOm veeradhwajaaya vidmahae\nVighna hastaaya Dheemahe\nThanno Bhouma Prachodayath","chevvai"));
        slokas.add(new Sloka("புதன் காயத்ரி\n\nஓம் கஜத்வஜாய வித்மஹே\nசுக அஸ்தாய தீமஹி\nதன்னோ புத ப்ரசோதயாத்\n", "Budha Gayatri\n\nOm Gajadhwajaaya vidmahae\nSukha hastaaya Dheemahe\nThanno Budha Prachodayath","bhudan"));
        slokas.add(new Sloka("குரு காயத்ரி\n\nஓம் வ்ருஷ பத்வஜாய வித்மஹே\nக்ருணி அஸ்தாய தீமஹி\nதன்னோ குரு ப்ரசோதயாத்\n", "Guru Gayatri\nOm Vrishabadhwajaaya vidmahae\nKruni  hastaaya Dheemahe\nThanno Guru Prachodayath","guru"));
        slokas.add(new Sloka("சுக்கிரன் காயத்ரி\n\nஓம் அச்வத்வஜாய வித்மஹே\nதனூர் அஸ்தாய தீமஹி\nதன்னோ சுக்ர ப்ரசோதயாத்\n", "Shukra Gayatri\nOm aswadhwajaaya  vidmahae\ndhanur hastaaya Dheemahe\nThanno Shukra Prachodayath","sukran"));
        slokas.add(new Sloka("சனி காயத்ரி\n\nஓம் காகத்வஜாய வித்மஹே\nகட்க அஸ்தாய தீமஹி\nதன்னோ மந்த ப்ரசோதயாத்\n", "Sanishwara Gayatri\nOm kaakadhwajaaya vidmahae\nkhadga hastaaya Dheemahe\nThanno Mandah Prachodayath","sanieswaran"));
        slokas.add(new Sloka("ராகு காயத்ரி\n\nஓம் நாகத்வஜாய வித்மஹே\nபத்ம அஸ்தாய தீமஹி\nதன்னோ ராகு ப்ரசோதயாத்\n", "Rahu Gayatri\nOm naakadhwajaaya vidmahae\npadma hastaaya Dheemahe\nThanno Rahu Prachodayath","rahu"));
        slokas.add(new Sloka("கேது காயத்ரி\n\nஓம் அஸ்வத்வஜாய வித்மஹே\nசூல அஸ்தாய தீமஹி\nதன்னோ கேது ப்ரசோதயாத்\n", "Kethu Gayatri\nOm aswadhwajaaya vidmahae\nsoola hastaaya Dheemahe\nThanno Kethu Prachodayath","kethu"));
    }

    class slokaArrayAdapter extends ArrayAdapter<Sloka> {
        private Context context;
        private List<Sloka> slokas;


        public slokaArrayAdapter(Context context, int resource, ArrayList<Sloka> objects) {
            super(context, resource, objects);

            this.context = context;
            this.Slokas = objects;

        }

        //called when rendering the list
        public View getView(int position, View convertView, ViewGroup parent) {

            //get the property we are displaying
            Sloka sloka = slokas.get(position);

            //get the inflater and inflate the XML layout for each item
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            //conditionally inflate either standard or special template
            View view;
            view = inflater.inflate(R.layout.activity_main, null);

            TextView tv_ta = (TextView) view.findViewById(R.id.tv_ta);
            TextView tv_en = (TextView) view.findViewById(R.id.tv_ta);
            ImageView iv_graha = (ImageView) view.findViewById(R.id.iv_graha);

            tv_ta.setText(...);
            int imageID = context.getResources().getIdentifier(sloka.getImage(), "drawable", context.getPackageName());
            iv_graha.setImageResource(imageID);

            return view;
        }
    }
}
