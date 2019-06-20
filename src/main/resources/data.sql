# Password: ABCabc123
INSERT INTO customers(id, first_name, last_name, email, password, role, status)
VALUES (1, 'Mariusz', 'Cichy', 'mariusz.cichy@mcpm.pl', '$2a$10$6YgUTaHo4KHdjycA20WSqexeM267ESo6VqBqH9Qcx5GITtcOGV9zS', 'ROLE_USER','REGISTERED');
# Password: ABCabc123
INSERT INTO customers(id, first_name, last_name, email, password, role, status)
VALUES (2, 'Anna', 'Cichy', 'anna.cichy@mcpm.pl', '$2a$10$6YgUTaHo4KHdjycA20WSqexeM267ESo6VqBqH9Qcx5GITtcOGV9zS', 'ROLE_ADMIN', 'REGISTERED');


INSERT INTO pools(id, question, start_date, end_date)
VALUES (1, 'Czy jesteś zadowolony z asortymentu choinek świątecznych oferowanych przez Let\'s Play?',
        DATE('2018-01-01 00:00:00'), DATE('2018-01-31 23:59:59'));
INSERT INTO pools(id, question, start_date, end_date)
VALUES (2, 'Jakim prezent dałbyś najważniejszej dla Ciebie osobie z okazji urodzin?',
        DATE('2018-02-01 00:00:00'), DATE('2018-02-28 23:59:59'));
INSERT INTO pools(id, question, start_date, end_date)
VALUES (3, 'Jaki jest Twój ulubiony kolor?',
        DATE('2018-03-01 00:00:00'), DATE('2018-03-31 23:59:59'));
INSERT INTO pools(id, question, start_date, end_date)
VALUES (4, 'Z jakiej okazji ubrałabyś się w sukienkę z balonów?',
        DATE('2018-04-01 00:00:00'), DATE('2018-04-30 23:59:59'));
INSERT INTO pools(id, question, start_date, end_date)
VALUES (5, 'Jakie jest Twoje ulubione święto?',
        DATE('2018-05-01 00:00:00'), DATE('2018-05-31 23:59:59'));
INSERT INTO pools(id, question, start_date, end_date)
VALUES (6, 'Jakie informacje chiałbyś zobaczyć na naszej stronie internetowej?',
        DATE('2018-06-01 00:00:00'), DATE('2018-06-30 23:59:59'));
INSERT INTO pools(id, question, start_date, end_date)
VALUES (7, 'Jak Ci się podoba nasza strona internetowa?',
        DATE('2019-01-01 00:00:00'), NULL);

INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (1, 'Tak', 87);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (1, 'Nie', 13);

INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (2, 'Zegarek', 15);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (2, 'Pierścionek', 48);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (2, 'Telefon komórkowy', 3);

INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (3, 'Różowy', 20);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (3, 'Niebieski', 34);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (3, 'Fioletowy', 2);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (3, 'Czerwony', 38);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (3, 'Zielony', 15);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (3, 'Żółty', 10);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (3, 'Inny', 5);

INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (4, 'Impreza', 29);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (4, 'Ślub', 10);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (4, 'Spotkanie z przyjaciółmi', 4);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (4, 'Zwykły dzień', 0);

INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (5, 'Boże narodzenie', 33);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (5, 'Rocznica Twojego ślubu', 4);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (5, 'Twoje urodziny', 43);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (5, 'Walentynki', 14);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (5, 'Nowy Rok', 29);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (5, 'Wielkanoc', 9);

INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (6, 'Możliwość zaprojektowanie własnego tortu', 27);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (6, 'Możliwość stworzenia albumu ze zdjęciami', 42);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (6, 'Możliwość zaprojektowanie własnego kapelusza', 7);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (6, 'Informacje na temat naszych lokalizacji', 2);

INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (7, 'Bardzo dobra', 43);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (7, 'Dobra', 12);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (7, 'Słaba', 1);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (7, 'Lepiej nie mówić', 0);

INSERT INTO items (id, image, celebration, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (1, LOAD_FILE('/var/lib/mysql/play/movado-watch-300x300.jpg'), 'Rocznica ślubu', 'Zegarek Movado', 'Woman\'s Movado Red Label automatic watch',
'Women\'s Red Label automatic watch, 26 mm rose gold PVD-finished stainless steel case with exhibition back, black Museum dial with rose gold-toned dot and hands, and red lettering, rose gold PVD-finished stainless steel link bracelet with push-button deployment clasp.',
200.00, NULL, 5, NULL);

INSERT INTO items (id, image, celebration, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (2, LOAD_FILE('/var/lib/mysql/play/titan-watch-300x300.jpg'), 'Rocznica ślubu', 'Zegarek Titan', 'Piękny zegarek firmy Titan.',
        'Analogue watch with a circular case and stainless steel back, has a stylised floral-shaped bezel embellished with white stones Water-resistant up to 30 m.',
        200.00, NULL, 5, NULL);

INSERT INTO items (id, image, celebration, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (3, LOAD_FILE('/var/lib/mysql/play/golden-ring-300x300.jpg'), 'Rocznica ślubu', 'Pierścionek z diamentem', '18 karatowy złoty pierścionek z diamentem.',
'A true design masterpiece. Flawlessly engineered, the six-prong setting virtually disappears and allows the brilliant diamond to float above the warm 18k yellow gold band and into the light.',
700.00, NULL, 5, NULL);

INSERT INTO items (id, image, celebration, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (4, LOAD_FILE('/var/lib/mysql/play/couple-rings-300x300.jpg'), 'Rocznica ślubu', 'Pierścionek dla niej i dla niego', 'Doskonały prezent z okazji rocznicy ślubu',
'A gorgeous 18k gold diamond ring for her and a simple 18k gold ring for him. To doskonały prezent z okazji Rocznica ślubu.',
1000.00, NULL, 5, NULL);

INSERT INTO items (id, image, celebration, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (5, LOAD_FILE('/var/lib/mysql/play/iphonex-black-300x300.jpg'), 'Urodziny', 'iPhone X', 'Telefon Apple iPhone X Czarny 256GB',
'iPhone 4 features a 5 megapixel autofocus camera with a 5x digital zoom, a backside illuminated sensor and built-in LED flash that allows you to take amazing pictures even in low light and dark environments. iPhone 4 lets you record and edit incredible HD video and the popular tap to focus feature now works while recording video. You can use the iPhone 4‘s LED flash for both still photography and video recording. The iMovie® app for iPhone lets you combine movie clips, add dynamic transitions and themes and include photos and music, and users can buy it through the App Store right on their phone. The iPhone 4 includes Multitasking, Folders, enhanced Mail, deeper Enterprise support and Apple’s iAd mobile advertising platform. With Multitasking, users can now instantly switch between any of their apps while preserving battery life. With Folders, users can easily organize their apps into collections by simply dragging one app on top of another.',
4290.00, NULL, 5, NULL);

INSERT INTO items (id, image, celebration, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (6, LOAD_FILE('/var/lib/mysql/play/birthday-cake-300x300.jpg'), 'Urodziny', 'Tort urodzinowy', 'Wiggles Birthday cake to make your kid feel special',
'For that special occasion you only want the best. This cake is for your \'Little Wiggle\' who would love the mouthwatering white chocolate cake with the lovely topping featuring the Wiggles in their big red car. Specially crafted to the highest quality at a reasonable price.',
200.00, NULL, 7, NULL);

INSERT INTO items (id, image, celebration, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (7, LOAD_FILE('/var/lib/mysql/play/birthday-flowers-vase-300x300.jpg'), 'Urodziny', 'Bukiet kwiatów i wazon', 'Surprise your loved ones with flowers',
'Basket of mixed flowers to make the birthday girl feel really special. Surprise your loved one with the gift that she would love.',
180.00, 10.00, 5, 3);

INSERT INTO items (id, image, celebration, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (8, LOAD_FILE('/var/lib/mysql/play/christmas-tree-300x300.jpg'), 'Boże Narodzenie', 'Choinka świąteczna', 'Delux quality Christmas Tree for home or office',
'Deluxe green Majestic Pine Traditional Christmas Tree with metal hinged branches. Green Metal Stand. Bulky item. Size: 3.00 metres high.',
300.00, 20.00, 5, 3);

INSERT INTO items (id, image, celebration, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (9, LOAD_FILE('/var/lib/mysql/play/multiple-christmas-trees.jpg'), 'Boże Narodzenie', 'Zestaw choinek świątecznych', 'Delux quality Christmas Trees for home or office',
'Deluxe green Majestic Pine Traditional Christmas Trees with metal hinged branches. Green Metal Stand. Bulky item. Size: 2.1 meters high',
500.00, 50.00, 5, 3);

INSERT INTO items (id, image, celebration, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (10, LOAD_FILE('/var/lib/mysql/play/christmas-decoration-folk-300x300.jpg'), 'Boże Narodzenie', 'Bombki kaszubskie', 'Silver Jewel Ball Decoration for your Christmas tree',
'Silver acrylic ball with diamontes and silver glitter hand painted decoration. Size: 80mm diameter',
10.00, 2.00, 5, 3);

INSERT INTO items (id, image, celebration, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (11, LOAD_FILE('/var/lib/mysql/play/christmas-candles-300x300.jpg'), 'Boże Narodzenie', 'Świece świąteczne', 'Silver & Blue Ball Decoration for your Christmas tree',
'Silver & Blue acrylic ball with diamontes and colored glitter hand painted decoration. Size: 80mm diameter',
10.00, 2.00, 5, 3);

INSERT INTO items (id, image, celebration, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (12, LOAD_FILE('/var/lib/mysql/play/compendium-300x300.jpg'), 'Impreza firmowa', 'Organizator', 'Diary/Organizer/Compendium for office use',
'Smooth leather-looking exterior with loop closure. Available in black & comes complete with mouse pad, note & card pockets, pen holder & lined notepad.',
300.00, 30.00, 5, 3);

INSERT INTO items (id, image, celebration, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (13, LOAD_FILE('/var/lib/mysql/play/mouse-pad-300x300.jpg'), 'Impreza firmowa', 'Podkładka pod myszkę', 'Basic Mouse Pad',
'Thin, hard surface offers improved tracking and responsiveness. Non-skid rubber base protects desktops from scuffs and scratches. Durable polyester construction. Size: 239 x 190 mm',
30.00, 3.00, 5, 3);

INSERT INTO items (id, image, celebration, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (14, LOAD_FILE('/var/lib/mysql/play/mug-300x300.jpg'), 'Impreza firmowa', 'Kubek', 'Classic Coffee Mug',
'Perfect for home or office, the coffee mug is microwave and dishwasher safe.',
50.00, 1.00, 5, 3);

INSERT INTO items (id, image, celebration, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (15, LOAD_FILE('/var/lib/mysql/play/pen-300x300.jpg'), 'Impreza firmowa', 'Pióro', 'Classic Pen',
'Quality pens at an affordable price. Nib Size 1.0mm. Pack of 50',
225.00, NULL, 25, NULL);






