package com.dicoding.picodiploma.resepkue.model

import com.dicoding.picodiploma.resepkue.R


    object kueData {

        private val kueNames = arrayOf(
            "Kue Pukis",
            "Kue Lumpur",
            "Kue Nagasari",
            "Kue Dadar Gulung",
            "Kue Onde-onde",
            "Kue Parpare",
            "Bakpia",
            "Molen Pisang",
            "Kue Lapis",
            "Kue Cucur"

        )

        private val kueDetails = arrayOf(

            "Pukis adalah sebuah kue khas Indonesia. Kue ini dibuat dari adonan telur, gula pasir, tepung terigu, ragi dan santan. Adonan itu kemudian dituangkan ke dalam cetakan setengah bulan serta dipanggang di atas api (bukan oven). Pukis dapat dikatakan sebenarnya adalah modifikasi dari kue wafel. Variasinya bermacam-macam, diberi taburan coklat butir, keju, selai nanas, sukade (manisan buah, biasanya dari pepaya dan dipotong kecil kecil serta berwarna warni) atau kacang.",
            "Kue lumpur adalah penganan ringan dengan bahan utama santan, kentang, tepung terigu, dan telur. Sebagai pewangi digunakan vanila dan sering kali diberi hiasan kismis dan kelapa muda iris di permukaannya.",
            "Nagasari adalah sejenis kue yang terbuat dari tepung beras, tepung sagu, santan, dan gula yang diisi pisang. Pisang yang biasa digunakan sebagai isi adalah pisang jenis pisang raja. Kue ini biasanya dibalut dengan daun pisang lalu dikukus. Selain bahan yang tersebut di atas, nagasari juga sering dikukus dengan balutan daun pandan sehingga memunculkan aroma wangi yang. Melihat dari paduan dari potongan kecil-kecil pisang raja yang dibalut dengan tepung menciptakan rasa yang khas di mulut serta tekstur kue yang lembut membuat kue yang satu ini memiliki cita rasa yang khas.",
            "merupakan penganan khas Indonesia dan Malaysia yang dapat digolongkan sebagai panekuk yang diisi dengan parutan kelapa yang dicampur dengan gula jawa cair. Isi ini disebut unti. Kulit dadar gulung umumnya berwarna hijau karena diberi pewarna daun suji.",
            "Onde-onde terbuat dari tepung terigu ataupun tepung ketan yang digoreng atau direbus dan permukaannya ditaburi/dibalur dengan biji wijen. Terdapat bermacam-macam variasi, yang paling dikenal adalah onde-onde yang terbuat dari tepung ketan dan di dalamnya diisi bubuk kacang hijau. Variasi lain hanya dibuat dari tepung terigu dan diberi warna pada permukaannya seperti putih, merah, atau hijau yang dikenal sebagai onde-onde gandum, yang merupakan onde-onde khas dari kota Mojokerto",
            "Sebenarnya ini sama dengan kue bugis yaitu kue yang terbuat dari tepung ketan yang diadonin dengan santan. Setelah itu diisi dengan centi (ampas kelapa yang disiram dengan air gula), lalu dibungkus dengan daun pisang, dan dikukus, bedanya tidak dibungkus daun dan dibentuk seperti pare.",
            "Bakpia merupakan makanan yang terbuat dari campuran kacang hijau dengan gula, yang dibungkus dengan tepung, lalu dipanggang. Istilah bakpia sendiri adalah berasal dari dialek Hokkian, yaitu dari kata \"bak\" yang berarti daging dan \"pia\" yang berarti kue, yang secara harfiah berarti roti berisikan daging. Di beberapa daerah di Indonesia, makanan yang terasa legit ini dikenal dengan nama pia atau kue pia.",
            "Merupakan hidangan ringan berbahan baku pisang yang dilapisi gulungan lembar-lembar adonan pastri dan kemudian digoreng dengan minyak. Hidangan ini merupakan variasi dalam pengolahan dari pisang goreng. Pisang molen dengan kulit pastri yang tipis, garing, dan renyah nikmat disantap dengan ditemani segelas kopi atau teh hangat.",
            "Kue lapis adalah makanan khas Indonesia. Kue ini biasanya terdiri dari dua warna yang berlapis-lapis, ini yang memberi nama kue ini. Kue ini dibuat dari tepung beras, tepung kanji, santan, gula pasir, garam dan pewarna. Kue ini dikukus setiap lapisannya sebelum kemudian lapisan di atasnya ditambahkan. Kue ini banyak ditemui di daerah-daerah di Indonesia.",
            "Kue Kucur atau Kucur (dalam bahasa Indonesia) atau kuih cucur (dalam bahasa Melayu), dan disebut khanom fak bua (ขนมฝักบัว) atau khanom jujun (ขนมจู้จุน or จูจุ่น) dalam bahasa Thailand, adalah kudapan tradisional di kawasan Asia Tenggara, termasuk Indonesia, Malaysia dan Thailand Selatan . Di Indonesia, kue kucur dapat ditemukan di seluruh pasar tradisional; akan tetapi, versi popularnya, adalah versi Betawi dari Jakarta dan terkenal juga dengan nama Kue Cucur di Provinsi Sulawesi Utara."
        )

        private val kueImages = intArrayOf(
            R.drawable.pukis,
            R.drawable.kue_lumpur,
            R.drawable.nagasari,
            R.drawable.dadar_gulung,
            R.drawable.onde_onde,
            R.drawable.kue_papare,
            R.drawable.bakpia,
            R.drawable.molen_pisang,
            R.drawable.kue_lapis,
            R.drawable.kue_cucur

        )

        private val kueBahan :Array<String> = arrayOf(
            "- 200 gram tepung terigu\n- 3 butir telur ayam utuh\n- 2 kuning telur\n- 300 mili santan\n- 70 mili air hangat\n- 1 sendok makan ragi kue\n- 1 sendok makan garam\n- 150 gram gula pasir\n- 130 gram keju\n- 130 gram meisis cokelat",
            "- 500 gr pure labu kuning\n- 3 kuning telur\n- 2 putih telur\n- 250 gr gula pasir\n- 1/2 sdt garam\n- 1 sdt vanilli\n- 250 gr tepung terigu serbaguna\n- 450 ml santan dari 1/2 butir kelapa\n- 2 helai daun pandan, simpulkan\n- 100 gr margarin, lelehkan\n- keju untuk topping secukupnya",
            "- 500 gr tepung beras \n- 1,5 liter santan biasa (tidak kental tidak cair) \n- 250 gr gula pasir \n- 4 lembar daun pandan \n- 1/2 sdm garam \n- pisang raja iris iris untuk isian",
            "Bahan isian:\n- 2 buah kuning telur \n- 250ml susu cair \n- 50gr gula pasir \n- 2sdm munjung daging durian\n- 1/2sdt garam\n- 1sdm tep custard\n- 1,5sdm tep maizena\n- 1/2sdt vanilla paste\n\nBahan kulit:\n- 1 butir telur\n- 450ml susu cair\n- 1sdm minyak sayur\n- 200gr tep terigu\n- 1sdm tep kanji\n- 10gr coklat bubuk\n- 1/2sdt garam",
            "Bahan isi:\n- 150 gr kacang hijau kupas, direndam selama 1 jam\n- 100 gr gula pasir\n- 2 lembar daun pandan, diikat simpul\n- 1/2 sdt garam\n- 200 ml santan dari 1/2 butir kelapa\n\nBahan kulit:\n- 250 gr tepung ketan putih\n- 1/2 sdt grm\n- 50 gr kentang kukus, dihaluskan\n- 75 gr gula pasir halus\n- 160 ml air hangat\n- 125 gr wijen untuk pelapis\n- Minyak untuk menggoreng",
            "- 200 gram tepung ketan putih\n- 200 ml santan hangat (kurang lebih)\n- secubit garam\n- secukupnya pasta pandan\n\nBahan isian:\n- 50 gram gula merah\n- 1/4 butir kelapa parut muda\n- 1 lmbr daun pandan",
            "- 380 gr terigu\n- 80 gr gula pasir\n- 75 gr mentega\n- 1/2 bks ragi instant\n- Sedikit garam\n- 180 ml air hangat\n\nBahan isian kacang ijo:\n- 200 gr kacang ijo kupas, rendam 1 jam\n- 200 ml santan encer\n- 120 gr gula pasir\n- 1/2 sdt garam\n- 1/2 sdt vanili bubuk\n- 2 lbr pandan",
            "Bahan kulit:\n- 500 gr terigu protein sedang\n- 1/2 sdt garam\n- 1 sdm gulpas\n- 100 gr margarin\n- 60 ml minyak goreng\n- 170 ml air\n",
            "- 350 gr tepung beras\n- 175 gr tepung tapioka\n- 1450 ml santan kekentalan sedang\n- 400 gr gula pasir\n- 1 sdt garam\n- Pewarna merah rose secukupnya",
            "- 250 gr gula merah\n- 450 ml air\n- 200 gr tepung terigu\n- 100 gr tepung beras\n- 1/4 sdt garam\n- 3 lembar daun pandan"
        )

        private val kueCara :Array<String> = arrayOf(
            "Pertama potong atau parut keju sebagai topingnya. Kemudian campurkan ragi kue dengan air hangat dan mengaduknya sampai larut. Setelah larut secara sempurna maka sisihkan.Lalu, rebus santan, dengan diaduk terus agar santan tidak menggumpal atau pecah. Hal itu dilakukan sampai santan mendidih, setelah mendidih maka api dapat dimatikan dan biarkan santan menghangat.\n\nKemudian masukkan ragi kue ke dalam adonan tersebut dan masukkan santan hangat. Aduk lagi hingga semua bahan tersebut tercampur merata atau tidak ada gumpalan sekalipun kecil. Setelah itu diamkan sekitar 15 sampai 25 menit. Kemudian, siapkan cetakan kue pukis atau loyang di atas kompor dengan api kecil. Api besar wajib dihindari agar kue tidak gosong atau matang hanya sebagian.\n\nSetelah itu oles cetakan kue dengan margarine. Maka adonan dapat di tuang ke cetakan sampai hampir penuh dan tutup sebentar. Setelah beberapa menit buka penutup tersebut dan berikan taburan keju atau meises maupun topping lain sesuai selara. Kemudian tutup kembali sampai matang.Tatkala kue pukis dirasa sudah matang, maka angkat kue cubit dari cetakan. Lalu sajikan kue pukis sebagai teman keluarga atau persiapan untuk jualan maupun menyambut hari penting.",
            "Pertama, masak santan bersama daun pandan hingga mendidih. Dinginkan. Kocok telur dan gula pasir hingga mengembang dan berwarna pucat. Tambahkan garam dan vanilli, kocok hingga rata. Masukkan santan sedikit demi sedikit sambil terus dikocok rata dengan mixer kecepatan rendah atau bisa diaduk memakai spatula.\n\nKemudian, masukkan pure labu bergantian dengan tepung terigu. Aduk hingga rata. Masukkan margarin leleh. Aduk hingga rata. Panaskan cetakan kue lumpur, tuang adonan ke dalamnya dan tutup, gunakan api kecil ya. Setelah 3/4 matang, beri topping dan lanjutkan memasak hingga matang.",
            "Pertama siapkan dandangan, kukus sebentar tepung beras kurleb 15menit Sementara kita mengukus tepung beras, rebus santan, gula, garam daun pandan hingga mendidih, matikan api Siapkan tempat, lalu tuang sedikit demi sedikit santan rebus hingga adonan kalis dan bisa dibentuk. Masukkan adonan nagasari ke dalam daun nangka lalu beri topping pisan. Kukus lagi selama 15menit hingga matang",
            "Bahan isian:\nAduk rata semua bahan lalu masak dalam panci sambil terus diaduk dgn api sedang hingga meletup-letup & mengental. Sisihkan. \n\nBahan kulit: campur & aduk rata semua bahan lalu saring. Panaskan wajan teflon diameter 18cm yg sdh diolesi mentega lalu tuang adonan kulit kurang lebih 3sdm sambil wajan diputar sehingga adonan membentuk lingkaran lalu letakkan lg wajan diatas kompor dgn api kecil hingga kulit matang. Lakukan hingga adonan kulit habis. Ambil adonan kulit lalu beri bahan isian kemudian tutup & lipat seperti amplop. Siap disajikan.",
            "Cara membuat isi :\nkukus kacang hijau kupas selama 25 menit. Angkat, lalu blender halus bersama santan di dalam panci, masak kacang hijau yg sudah di haluskan bersama sisa santan, gula pasir, garam dan daun pandan. Aduk sampai kalis, biarkan dingin bentuk bulat, supaya rapi bisa di timbang. Masing2 15 gr sisihkan (sy ga timbang, hanya kira2 aja)\n\nCara membuat kulit :\ncampur tepung ketan putih, kentang kukus, gula pasir halus dan garam aduk rat, tuang air hangat sedikit2 sampai kalis dan licin. timbang masing-masing 25 gr (sy ga nimbang) pipihkan, beri isi bentuk bulat, lakukan sampai adonan habis",

            "Cara membuat isian:\nPanaskan kelapa parut dalam wajan aduk hingga kadar airnya berkurang. Tuang gula merah yang telah disisir, bila kurang manis bisa ditambah lagi. Panaskan hingga gula larut dan kelapa tidak terlalu basah.Angkat sisihkan.\n\nCara membuat kulit: \nTuang semua bahan dalam baskom kecuali santan. Tambahkan santan yang telah diberi pasta pandan sedikit demi sedikit sampai adonan bisa dibentuk Ambil adonan lalu bulatkan, isi dengan bahan unti, bentuk lonjong lalu bentuk kerat-kerat menggunakan tusuk gigi menyerupai kulit pare Kukus dalam dandang yang telah dipanaskan selama 15 menit. Saat mengukus simpan daun yang telah dioles minyak dalam dandang agar adonan tidak menempel Sesaat sebelum diangkat saya oles permukaan kue dengan minyak agar tidak nempel dan mengkilap.",

            "Cara membuat kulit:\nPertama, campurkan terigu, gula pasir & ragi. Tuang air hangat, uleni sampai setengah kalis. Masukkan garam & mentega, uleni sampai kalis elastis. Bulatkan adonan, diamkan 1 jam. Kempiskan adonan, bagi2 adonan (aku 20 gr, jadinya agak mini). Beri isian (aku pake isi kacang ijo) kemudian tutup & bulatkan. Diamkan kembali 30 menit.Panaskan teflon, jangan oles apapun. Panggang sambil agak ditekan. Balik sisi lainnya setelah agak kecoklatan.\n\nCara membuat isi:\nPertama, kukus kacang ijo kupas selama 30 menit sampai matang\n2. Blender dengan santan sampai halus\n3. Campurkan semua bahan, masak dengan api kecil, aduk terus sampai kalis & bisa dipulung.",

            "Pertama, panaskan margarin dan minyak sampai larut dan margarin mencair. Dalam keadaan panas, tuang ke terigu yang sudah dicampur garam dan gulpas, aduk rata lalu tambahkan air, aduk rata kembali. Diamkan selama 15 menit. Bagi adonan menjadi 20 bagian, giling tipis memanjang tiap bagiannya, lilitkan pada pisang yang sudah dikukus tadi. Lakukan sampai semua bahan habis. Goreng dlm minyak panas, api kecil sampai kekuningan.",

            "Pertama santan dimasak dengan api kecil, biarkan dingin. Masukan santan , gula pasir ke dalam chopper hingga gula larut, lalu masukkan garam, tepung chopper lagi, saring dan bagi 2 1 beri warna pink rose secukupnya aduk rata yang satu lagi biarkan putih. Oles loyang 18x18x8 cm dengan minyak, tuang adonan putih 100cc, kukus 5 menit lalu tuang adonan pink rose begitu selanjutnya sampai selesai, kukus kembali 30 menit biar tanak. Tiap menuang adonan diaduk dulu biar rata. Biarkan dingin, potong dengan pisau tajam yang dialasi plastik bening biar rapi. Siap sajikan.",

            "Pertama, masak gula merah, daun pandan dan air sampai mendidih dan gula larut, biarkan hangat. Campur tepung terigu dan tepung beras sampai rata, tambahkan garam. Aduk rata. Tuang air gula ke dalam campuran tepung terigu, sambil diaduk perlahan hingga adonan halus (bisa pakai whisk atau mixer dengan kecepatan tinggi 2-3 menitan). Diamkan 2 jam suhu ruang. Tuang satu sendok adonan ke dalam minyak yang sudah dipanaskan terlebih dahulu, biarkan sampai seratnya keluar. Lalu siram-siram bagian atasnya dengan minyak yang ada di penggorengan. Angkat, dan dinginkan."

        )

        val listData: ArrayList<Kue>
            get() {
                val list = arrayListOf<Kue>()
                for (position in kueNames.indices) {
                    val kue = Kue()
                    kue.name = kueNames[position]
                    kue.detail = kueDetails[position]
                    kue.photo = kueImages[position]
                    kue.bahan = kueBahan[position]
                    kue.cara = kueCara[position]
                    list.add(kue)
                }
                return list
            }

    }
