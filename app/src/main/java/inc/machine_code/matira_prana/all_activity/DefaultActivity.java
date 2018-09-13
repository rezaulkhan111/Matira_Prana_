package inc.machine_code.matira_prana.all_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import inc.machine_code.matira_prana.adapter.DefaultAdapter;
import inc.machine_code.matira_prana.model.Default_Item;
import inc.machine_code.matira_prana.R;

public class DefaultActivity extends AppCompatActivity implements DefaultAdapter.InterfaceCallback {
    DefaultAdapter adapter;
    ArrayList<Default_Item> defult_classArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);
        RecyclerView mRecyclerView = findViewById(R.id.rv_defult_list);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        Intent intent = getIntent();

        ArrayList<Default_Item> _defult_classes_Seri_able = (ArrayList<Default_Item>) intent.getSerializableExtra("savedUser");
        defult_classArrayList = _defult_classes_Seri_able;

        adapter = new DefaultAdapter(this, defult_classArrayList);
        mRecyclerView.setAdapter(adapter);

    }

    @Override
    public void inClickEvent(Default_Item default_item, String string) {
        Intent intent = new Intent(DefaultActivity.this, All_Text_View_Activity.class);
        switch (default_item.getSerial_NO()) {
            case "1":
                String Acid = "বর্তমান অবস্থা \n" +
                        "এসিডিয় \n" +
                        "১-৫.৯৯" +
                        "\n\n" +
                        "মাটির অ¤¬েত্বর কারন\n" +
                        " অ¤¬ীয় উৎস  শিলা- মাটির উৎপত্তির উৎস শিলা" +
                        " অ¤ী¬য় হলে মাটি অ¤ী¬য় হবে" +
                        " । মাটিতে গ্রানাইট,ব্রায়োলাইট,মাস্কোভাইট" +
                        " ইত্যাদি থাকিলে মাটি অ¤¬ীয় হবে ।" +
                        " অ¤¬যুক্ত সারের অধিক ব্যবহার- অ্যামোনিয়াম" +
                        " নাইট্রেট , ডি এ পি সার, অ্যামোনিয়াম সালফেট" +
                        " সার অধিক বৃষ্টিপাত ও চুয়ানি ঃ বৃষ্টি বেশি হলে" +
                        " মাটির ক্ষারীয় উপাদান যেমন ক্যালসিয়াম," +
                        "ম্যাগনেশিয়াম ইত্যাদি বৃষ্টির সাথে চুইয়ে শিকরে" +
                        " চলে যায় । ফলে হাইড্রোজেন আয়ন সে জায়গা" +
                        " দখল, করে ।ফলে মাটি অ¤¬ীয় হয় ।" +
                        " \n\n" +
                        "অ¤¬ীয় মাটি সংশোধনের" +
                        "\n\n" +
                        "মাটিতে হাইড্রোজেন আয়নের ঘনত্ব বৃদ্ধিই অ¤¬তার কারন ।  মাটির অতিরিক্ত অ¤¬তা ফসল " +
                        "উৎপাদনের ক্ষেত্রে প্রতিবন্ধকতা সৃষ্টি করে ,তাই অ¤¬ মাটি সংশোধন করতে হয় । নিæে অ¤¬ মাটি " +
                        "সংশোধনের উপায় দেয়া হল ঃ " +
                        "ক ) চুন জাতীয় অজৈব পদার্থ ব্যবহার ঃ চুন হল ক্যালসিয়াম বা ম্যাগনেসিয়াম জাতীয় ক্ষারীয় যৌগ " +
                        "যেমন- ক্যালসাইট (ঈধঈঙ৩ ), ম্যাগনেটাইট (গমঈঙ৩ )  ,  কুইক লাইম ,কলিচুন  ইত্যাদি " +
                        "ব্যবহার করে ক্যালসিয়াম বা ম্যাগনেসিয়াম আয়ন মাটির হাইড্রোজেন আয়নকে দূর করে উক্ত স্থানে " +
                        "প্রতিস্থাপিত হয়। ফলে মাটির অ¤ত¬¡ বেড়ে যায় । " +
                        "ও. খ) জৈব সার ব্যবহার: বায়োফার্টিলাইজার বা অণুজীব সার ব্যবহার ঃ বিভিন্ন প্রকার " +
                        "অণুজীব সার যেমন রাইজোবিয়াম , অ্যাজোটোব্যাক্টর ,অ্যাজোলা ,সবুজ শৈবাল ইত্যাদি অ¤¬ মাটিতে " +
                        "পরিমাণ মত ব্যবহার করে মাটির অ¤ত¬া কমানো যায় । অণুজীবসমূহ মাটিতে বিদ্যমান জৈব পদার্থ " +
                        "নিঃশেষ হতে বাধা প্রদান করে ফলে মাটির বাফার ক্ষমতা বৃদ্ধি পায় এবং মাটি নিরপেক্ষ হয় । " +
                        "ওও. ক¤েপাস্ট , গোবর সার ,সবুজ সার ব্যবহার ঃ বিভিন্ন প্রকার জৈব সার যেমন ভার্মি " +
                        "ক¤েপাস্ট , গোবর এবং সবুজ সার যেমন ধইঞ্চা ইত্যাদি ব্যবহার করে জমির অ¤ত¬া কমিয়ে জমি " +
                        "নিরপেক্ষ করা যায় ।  " +
                        "ওওও. জৈব বালাইনাশক ব্যবহার ঃ জৈব বালাইনাশক যেমন নিম তেল , উপকারী পোকা " +
                        "ব্যবহার , তামাক পাতার নির্যাস ইত্যাদি ব্যবহার করলে, অজৈব উপাদানে তৈরি বালাইনাশক যেমন " +
                        "কার্বনডাজিন , ডায়াথেন ইত্যাদি অ¤ী¬য় বালাইনাশক ব্যবহারের প্রয়োজন হয় না ফলে মাটির অ¤ত¬া " +
                        "বৃদ্ধি প্িরতরোধ করা যায় । " +
                        "গ) সেচের পানির মান উনয়œন ঃ সেচের পানিতে আয়রন ও অ্যালুমিনিয়াম মিশ্রিত থাকিলে মাটির " +
                        "অ¤¬তা বৃদ্ধি পায় তাই সেচের পানি অবশ্যই অ¤¬ীয় উপাদান মুক্ত হতে হবে । " +
                        "ঘ) কাঠের ছাই ও ঝিনুকের গুড়া প্রয়োগ ঃ কাঠের গুড়া ও ঝিনুকে প্রচুর পরিমানে ক্যালসিয়াম " +
                        "আয়ন থাকে যা মাটির অ¤ত¬া হ্রাসে সাহায্য করে । " +
                        "ঙ) শস্যচক্র মেনে চলা ঃ একই জমিতে বার বার একই ফসল চাষ করিলে অ¤ত¬া বৃদ্ধি পেতে পারে " +
                        "তাই শস্যচক্র মেনে চলতে হবে । জমিতে অ¤¬িপ্রয় ফসল যেমন লেবু,কমলা, মাল্টা ইত্যাদি চাষ " +
                        "করিলে মাটির অ¤ত¬া হ্রাস করা যায় ";
                intent.putExtra("SendData", Acid);
                startActivity(intent);
                break;
            case "4":
                String Naitrogen = "কাজ\n" +
                        "উদ্ভিদের পত্রপল্লব, ডালপালা বৃদ্ধিতে সাহায্য করে৷\n" +
                        "ইহা গাছকে গাঢ় সবুজ করে তুলে৷\n" +
                        "\n" +
                        "গাছের অধিক কুশি গজাতে সাহায্য করে৷\n" +
                        "\n" +
                        "খাদ্যে আমিষের পরিমাণ বাড়ায়৷\n" +
                        "\n" +
                        "অধিক ফলন পেতে সাহায্য করে৷\n" +
                        "অভাবজনিত লক্ষণ" +
                        "গাছের বা মাঠের সমগ্র ফসল হালকা সবুজ কিংবা হালকা হলুদ বর্ণ ধারণ করে৷\n" +
                        "\n" +
                        "নিচের দিকে পুরানো পাতা প্রথমে হালকা রঙ ধারণ করে৷ পুরানো পাতার আগা থেকে এই বিবর্ণতা শুরু হয়৷\n" +
                        "\n" +
                        "খাদ্য খস্য ওজনে হালকা হয়৷\n" +
                        "অতিরিক্ত প্রয়োগের আসুবিধা" +
                        "গাছের কাঠামোকে দুর্বল করে ফেলে৷\n" +
                        "\n" +
                        "গাছের কাণ্ড লম্বা হয়ে পড়ে৷\n" +
                        "\n" +
                        "গাছের রোগ প্রতিরোধ ক্ষমতা কমে যায়৷\n" +
                        "\n" +
                        "শিকড়ের বৃদ্দি কমে যায়৷\n" +
                        "\n" +
                        "ফসল অনিয়মিতভাবে পাকে\n" +
                        "\n" +
                        "ফুল হ্রাস পায়৷ ফলে ফলন কমে যায়৷";
                intent.putExtra("SendData", Naitrogen);
                startActivity(intent);
                break;
            case "5":
                String Naitrogen2 = "জমিতে ইউরিয়ার অভাব দেখা গেলে করণীয়ঃ\n" +
                        "•    জমিতে তিন কিস্তিতে ইউরিয়া সার দিতে হবে। ১ম কিস্তি জমি তৈরির শেষ সময়, ২য় কিস্তি রোপণের ২১-২৫ দিন পর এবং ৩য় কিস্তি কাইচ থোড় আসার ৫-৭ দিন আগে জমিতে দিতে হবে।\n" +
                        "•    জমিতে ছিপছিপে পানি থাকা অবস্থায় ইউরিয়া সমানভাবে ছিটিয়ে দিতে হবে। এরপর হাতড়িয়ে বা নিড়ানি দিয়ে ইউরিয়া সার মাটির সাথে মিশিয়ে দিতে হবে।";
                intent.putExtra("SendData", Naitrogen2);
                startActivity(intent);
                break;
            case "6":
                String Phosphorus = "কাজ\n" +
                        "১. গাছের শিকড় গঠনে সাহায্য করে৷\n" +
                        "\n" +
                        "২. ফুল, ফল এবং বীজ গঠনে সহায়তা করে৷\n" +
                        "\n" +
                        "৩. ফসলের পরিপক্বতা ত্বরান্বিত করে৷\n" +
                        "\n" +
                        "৪. গাছকে শক্ত ও মজবুত করে তুলে৷\n" +
                        "\n" +
                        "৫. গাছকে রোগ প্রতিরোধ করতে সাহায্য করে৷\n" +
                        "\n" +
                        "৬. গাছকে খরা ও শীত সহিষ্ঞু করে তুলে৷\n" +
                        "অভাবজনিত লক্ষণ\n" +
                        "১. গাছ গাঢ় সবুজ বর্ণ ধারণ করে৷\n" +
                        "\n" +
                        "২. শিকড়ের বৃদ্ধি কমে যায়৷\n" +
                        "\n" +
                        "৩. ফুল ফল ও বীজ কম হয়৷\n" +
                        "\n" +
                        "৪. ফসল পরিপক্ব হতে দেরী হয়৷\n" +
                        "\n" +
                        "৫. ফসল ওজনে কম হয়৷\n" +

                        "অতিরিক্ত প্রয়োগের আসুবিধা\n" +
                        "১. ফসলের পরিপক্ব হতে দেরী হয়\n" +
                        "\n" +
                        "২. বেলে মাটিতে অতিরিক্ত পটাশ অপচয় হয়৷";
                intent.putExtra("SendData", Phosphorus);
                startActivity(intent);
                break;
            case "7":
                String Phosphorus2 = "জমিতে টি এস পি’র অভাব দেখা গেলে করণীয়ঃ\n" +
                        "•    জমি তৈরির শেষ পর্যায়ে জমিতে টি এস পি সার দিতে হবে\n" +
                        "•    যদি কোন কারণে জমিতে শেষ চাষের সময় এ সার দেয়া না যায় " +
                        "    তবে ধান লাগানোর ১৫-২০ দিনে মধ্যে বা  ১ম কিস্তি ইউরিয়া সারের সাথে দিতে হবে";
                intent.putExtra("SendData", Phosphorus2);
                startActivity(intent);
                break;
            case "8":
                String Potassium = "কাজ\n" +
                        "১. বয়স্ক পাতার আগা থেকে হলদে কমলা বা হলদে বাদামী রং ধারণ করে৷ পরে তাহা আস্তে আস্তে বোটার দিকে ছাড়িয়ে পড়ে৷\n" +
                        "\n" +
                        "২. গাছের বৃদ্ধি বাধাগ্রস্ত হয়৷\n" +
                        "\n" +
                        "৩. পোকা ও রোগ বালাই প্রতিরোধ ক্ষমতা কমে যায়৷\n" +
                        "\n" +
                        "৪. ফল আকারে ছোট হয়৷\n" +
                        "\n" +
                        "অভাবজনিত লক্ষণ\n" +
                        "\n" +
                        "১.বয়স্ক পাতার আগা থেকে হলদে কমলা বা হলদে বাদামী রং ধারণ করে৷ পরে তাহা আস্তে আস্তে বোটার দিকে ছড়িয়ে পড়ে৷\n" +
                        "\n" +
                        "২.গাছের বৃদ্ধি বাধাগ্রস্ত হয়৷\n" +
                        "\n" +
                        "পোকা ও রোগ বালাই প্রতিরোধ ক্ষমতা কমে যায়৷\n" +
                        "\n" +
                        "৩. ফল আকারে ছোট হয়৷\n" +
                        "\n" +
                        "অতিরিক্ত প্রয়োগের আসুবিধা\n" +
                        "\n" +
                        "১.ফসল বৃদ্ধি হওয়ার আগেই পেকে যেতে পারে৷\n" +
                        "\n" +
                        "২.গাছ নাইট্রোজেনের অভাব বোধ করতে পারে৷";
                intent.putExtra("SendData", Potassium);
                startActivity(intent);
                break;
            case "9":
                String Potassium2 = "জমিতে পটাশ সারের অভাব দেখা গেলে করণীয়ঃ\n" +
                        "•    জমি তৈরির শেষ সময় এই সার প্রয়োগ করা ভাল\n" +
                        "•    হালকা বেলে মাটিতে দুই কিস্তিতে পটাশ সারের সাথে প্রয়োগ করতে হয়";
                intent.putExtra("SendData", Potassium2);
                startActivity(intent);

        }

    }
}
