package com.example.dicodingsubmission;

import java.util.ArrayList;

public class HorrorData {
    private static String[] horrorNames = {
            "Rumah Dara",
            "Mata Batin",
            "Pengabdi Setan",
            "Ratu Ilmu Hitam",
            "Danur: I Can See Ghosts",
            "Sabrina",
            "Perempuan Tanah Jahanam",
            "Sebelum Iblis Menjemput Ayat 2",
            "Si Manis Jembatan Ancol",
            "Asih"
    };

    private static String[] horrorDetails = {
            "Rumah Dara adalah film horor jagal dari Indonesia yang dirilis pada tanggal 22 Januari 2010. Film yang bersemboyan \"Horor menemukan seorang ibu\" ini disutradarai oleh Mo Brothers dan dibintangi oleh Shareefa Daanish dan Julie Estelle sebagai tokoh utama.",
            "ALIA memutuskan untuk meninggalkan Bangkok dan kembali ke Jakarta begitu kedua orang tuanya meninggal. Ia dan Abel, adiknya yang masih remaja, pindah ke rumah masa kecil mereka yang jauh dari tengah kota. Tapi Abel yang sering bersikap aneh dan ketakutan, tidak menyukai rumah itu. Katanya, di sana ada ‘yang lain’ selain mereka. Alia dan Davin, pacar Alia yang menemani Alia, tidak pernah menghiraukan Abel. Tapi sikap Abel semakin mengkhawatirkan. Merasa harus menolong Abel, Alia berniat untuk membawa Abel ke psikiater. Tapi Abel menolak dan ia bilang kalau ia bisa melihat ‘mereka yang sudah mati’ karena mata batinnya sudah terbuka sejak kecil. Abel mengajak Alia menemui Bu Windu, seorang paranormal yang selama ini membantu Abel. Ingin membuktikan semua hal yang baginya tidak masuk akal ini, Alia meminta Bu Windu untuk membuka mata batinnya. Dan perlahan-lahan, Alia pun mulai mengalami kejadian-kejadian yang tidak biasa. Ia mulai melihat sosok yang tidak bisa dilihat orang lain, dan kehadiran ‘orang-orang’ yang minta tolong padanya. Tapi ‘mereka’ yang berada di rumah Alia mengganggunya sampai menyakitinya. Energi ‘mereka’ begitu negatif sehingga bisa membahayakan Alia dan Abel. Tanpa tempat tinggal lain, mereka terpaksa menetap disana dan meminta bantuan Bu Windu.",
            "Setelah sakit aneh selama 3 tahun, Ibu akhirnya meninggal dunia. Bapak lalu memutuskan untuk kerja di luar kota meninggalkan anak-anak. Tak lama kemudian, anak-anak merasa bahwa Ibu kembali berada di rumah. Situasi semakin menyeramkan ketika mereka mengetahui bahwa Ibu datang lagi tidak sekedar untuk menjenguk, tapi untuk menjemput mereka.",
            "Hanif membawa Nadya istrinya dan ketiga anak mereka ke panti asuhan tempat Hanif dulu dibesarkan. Pengasuh panti itu, Pak Bandi, sudah sangat tua dan sakit keras, Hanif datang untuk menjenguk setelah bertahun-tahun tidak bertemu. Bukan cuma Hanif yang datang berkunjung, tapi juga dua sahabat Hanif saat tinggal di panti, Anton dan Jefri yang membawa istri-istri mereka. Malam itu mereka semua tiba di panti asuhan yang terletak di luar kota dan jauh dari pemukiman penduduk itu. Mereka bermaksud bermalam di sana untuk memberikan penghormatan terakhir buat orang yang telah mengasuh mereka sejak kecil. Mereka menyangka malam itu akan jadi malam yang penuh kedamaian. Mereka segera memahami bahwa mereka salah.",
            "Danur merupakan film hantu Indonesia yang dirilis pada 30 Maret 2017 disutradarai oleh Awi Suryadi. Film ini diangkat dari buku karya Risa Saraswati, Gerbang Dialog Danur yang ditulis berdasarkan pengalamannya sendiri sebagai seorang gadis indigo.",
            "MAIRA hidup bahagia di pernikahan barunya bersama AIDEN, pembuat boneka Sabrina sekaligus pemilik sebuah perusahaan mainan. Tapi kebahagiaan mereka belum sempurna karena VANYA, anak angkat sekaligus keponakan Aiden yang yang piatu belum bisa menerima kehadiran Maira sebagai ibunya karena Vanya masih belum bisa merelakan kepergian ANDINI, bundanya yang sudah meninggal. Suatu hari, Vanya melakukan permainan ‘Pensil Charlie’ untuk memanggil bundanya dan kejanggalan-kejanggalan pun mulai terjadi. Maira dan Aiden Adak percaya, hingga akhirnya Maira mengalami serentetan kejadian menakutkan dan mereka melihat sendiri sosok Andini. Maira pun memanggil BU LARAS, seorang paranormal yang dulu pernah membantunya. Tapi Andini ternyata bukanlah Andini, melainkan iblis keji bernama BAGHIAH yang menetap di boneka Sabrina dan menginginkan tubuh manusia...",
            "Maya (Tarao Basro) jatuh bangun hidup di kota tanpa keluarga, ia hanya memiliki sahabat bernama Dini. Saat usaha bersama mereka membutuhkan modal lebih, Maya yang mendapatkan informasi bahwa dia mungkin memiliki harta warisan dari keluarganya yang kaya di desa, membuatnya pergi mengunjungi kampung halaman yang tak pernah dikenalnya itu. Sesampainya di kampung yang jauh terpencil di tengah hutan, Maya dan Dini sampai di rumah besar yang kosong. Situasi sekitar juga terlihat aneh, salah satunya banyak kuburan anak-anak. Hingga pada suatu malam, Maya mendengar jeritan perempuan yang hendak melahirkan. Maya menuju asal suara dan menyaksikan proses kelahiran anak tersebut. Dari situlah, sedikit demi sedikit, misteri kampung yang kini ditinggali Maya dan Dini mulai terungkap.",
            "Dua tahun setelah lepas dari teror iblis, Alfie dan Nara mencoba melanjutkan kehidupan mereka. Namun Alfie masih terus dihantui perasaan bersalah dan penglihatan tidak wajar. Mimpi terburuk Alfie nyatanya baru dimulai dan bahaya yang menunggu semakin mengancam, sosok kegelapan yang begitu haus akan jiwa bangkit untuk menjemput nyawa mereka.",
            "Maryam (Indah Permatasari), sosok perempuan yang mencari kebahagiaan saat rumah tangganya dengan lelaki bernama Roy (Arifin Putra) berada di ambang kehancuran. Hadirnya sosok Yudha (Randy Pangalila) mampu membuat Maryam menemukan ketenangan. Namun, sebuah kejadian tragis harus menimpanya. Setelah itu legenda menyeramkan mulai tersebar. Selain malapetaka, kehadiran sosoknya juga membawa pelajaran yang berharga untuk warga kampung dan orang-orang di sekitarnya.",
            "ASIH (Shareefah Daanish) perempuan malang itu mengakhiri hidup karena banyaknya kejadian naas yang menimpanya. Dia diusir dari rumah oleh ibu dan bapaknya, karena seorang laki-laki menghamilinya namun lari dari tanggung jawab. Keluarga Asih jelas tidak akan menerima anak Asih yang baru lahir, karena dianggap sebagai aib keluarga. Semua orang kampung mencemooh Asih, tidak ada satupun yang membelanya, hingga semua hal itu membuat Asih menjadi gila dan kemudian tega membunuh anaknya. Asih menanggung kesedihan dan marah hingga akhir hayatnya."
    };

    private static int[] horrorImages = {
            R.drawable.horror1,
            R.drawable.horror2,
            R.drawable.horror3,
            R.drawable.horror4,
            R.drawable.horror5,
            R.drawable.horror6,
            R.drawable.horror7,
            R.drawable.horror8,
            R.drawable.horror9,
            R.drawable.horror10
    };

    static ArrayList<Horror> getListData() {
        ArrayList<Horror> list = new ArrayList<>();
        for (int position = 0; position < horrorNames.length; position++) {
            Horror horror = new Horror();
            horror.setName(horrorNames[position]);
            horror.setDetail(horrorDetails[position]);
            horror.setPhoto(horrorImages[position]);
            list.add(horror);
        }
        return list;
    }
}
