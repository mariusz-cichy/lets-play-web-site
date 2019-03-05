INSERT INTO products(id, name, image)
VALUES (1, 'Balon: Cyfra 2', LOAD_FILE('/var/lib/mysql/play/balon_cyfra_2.jpg'));
INSERT INTO products(id, name, image)
VALUES (2, 'Balon: Cyfra 3', LOAD_FILE('/var/lib/mysql/play/balon_cyfra_3.jpg'));
INSERT INTO products(id, name, image)
VALUES (3, 'Balon: Cyfra 4', LOAD_FILE('/var/lib/mysql/play/balon_cyfra_4.jpg'));
INSERT INTO products(id, name, image)
VALUES (4, 'Balon: Cyfra 5', LOAD_FILE('/var/lib/mysql/play/balon_cyfra_5.jpg'));
INSERT INTO products(id, name, image)
VALUES (5, 'Balon: Cyfra 6', LOAD_FILE('/var/lib/mysql/play/balon_cyfra_6.jpg'));
INSERT INTO products(id, name, image)
VALUES (6, 'Balon: Cyfra 7', LOAD_FILE('/var/lib/mysql/play/balon_cyfra_7.jpg'));
INSERT INTO products(id, name, image)
VALUES (7, 'Balon: Cyfra 8', LOAD_FILE('/var/lib/mysql/play/balon_cyfra_8.jpg'));
INSERT INTO products(id, name, image)
VALUES (8, 'Balon: Cyfra 9', LOAD_FILE('/var/lib/mysql/play/balon_cyfra_9.jpg'));

INSERT INTO pools(id, question, start_date, end_date)
VALUES (1, "Czy jesteś zadowolony z asortymentu choinek świątecznych oferowanych przez Let's Play?",
        DATE('2018-01-01 00:00:00'), DATE('2018-01-31 23:59:59'));
INSERT INTO pools(id, question, start_date, end_date)
VALUES (2, "Jakim prezent dałbyś najważniejszej dla Ciebie osobie z okazji urodzin?",
        DATE('2018-02-01 00:00:00'), DATE('2018-02-28 23:59:59'));
INSERT INTO pools(id, question, start_date, end_date)
VALUES (3, "Jaki jest Twój ulubiony kolor?",
        DATE('2018-03-01 00:00:00'), DATE('2018-03-31 23:59:59'));
INSERT INTO pools(id, question, start_date, end_date)
VALUES (4, "Z jakiej okazji ubrałabyś się w sukienkę z balonów?",
        DATE('2018-04-01 00:00:00'), DATE('2018-04-30 23:59:59'));
INSERT INTO pools(id, question, start_date, end_date)
VALUES (5, "Jakie jest Twoje ulubione święto?",
        DATE('2018-05-01 00:00:00'), DATE('2018-05-31 23:59:59'));
INSERT INTO pools(id, question, start_date, end_date)
VALUES (6, "Jakie informacje chiałbyś zobaczyć na naszej stronie internetowej?",
        DATE('2018-06-01 00:00:00'), DATE('2018-06-30 23:59:59'));
INSERT INTO pools(id, question, start_date, end_date)
VALUES (7, "Jak Ci się podoba nasza strona internetowa?",
        DATE('2019-01-01 00:00:00'), NULL);

INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (1, "Tak", 87);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (1, "Nie", 13);

INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (2, "Zegarek", 15);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (2, "Pierścionek", 48);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (2, "Telefon komórkowy", 3);

INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (3, "Różowy", 20);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (3, "Niebieski", 34);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (3, "Fioletowy", 2);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (3, "Czerwony", 38);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (3, "Zielony", 15);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (3, "Żółty", 10);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (3, "Inny", 5);

INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (4, "Impreza", 29);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (4, "Ślub", 10);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (4, "Spotkanie z przyjaciółmi", 4);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (4, "Zwykły dzień", 0);

INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (5, "Boże narodzenie", 33);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (5, "Rocznica Twojego ślubu", 4);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (5, "Twoje urodziny", 43);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (5, "Walentynki", 14);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (5, "Nowy Rok", 29);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (5, "Wielkanoc", 9);

INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (6, "Możliwość zaprojektowanie własnego tortu", 27);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (6, "Możliwość stworzenia albumu ze zdjęciami", 42);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (6, "Możliwość zaprojektowanie własnego kapelusza", 7);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (6, "Informacje na temat naszych lokalizacji", 2);

INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (7, "Bardzo dobra", 43);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (7, "Dobra", 12);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (7, "Słaba", 1);
INSERT INTO pool_answers(pool_id, answer, votes)
VALUES (7, "Lepiej nie mówić", 0);

INSERT INTO items (id, celebrations, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (1, "Anniversary", "Movado Watch", "Movado ladies watch with pink dial",
"Made of solid, two-tone stainless steel, this polished women’s watch with smoothly sculpted lines features removable links at the back for an adjustable fit. Available with sparkling diamonds and a pink dial.",
200.00, NULL, 5, NULL);

INSERT INTO items (id, celebrations, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (2, "Anniversary", "Diamond Ring", "Our 18k Gold Diamond Ring is unique and gorgeous",
"Our 18k gold diamond ring is unique and gorgeous. The sevenstone diamond wedding and anniversary bands are the purest symbol of true love representing the journey you travelled since the moment you met, the experience you are living now, and the unimagined excitement that your future holds.",
700.00, NULL, 5, NULL);

INSERT INTO items (id, celebrations, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (3, "Anniversary", "Titan Watch", "A beautiful watch from Titan",
"Quartz movement, dress watch, polished gold-tone stainless steel bezel and crown, stainless steel case and case back, mineral crystal, 30 metres/100 feet water resistant.",
200.00, NULL, 5, NULL);

INSERT INTO items (id, celebrations, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (4, "Anniversary", "Ring for her and Ring for him", "A perfect Anniversary Gift",
"A gorgeous 18k gold diamond ring with seven stone diamonds for her and a simple 18k gold ring for him. This is a perfect gift for an anniversary.",
1000.00, NULL, 5, NULL);

INSERT INTO items (id, celebrations, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (5, "Birthday", "iPhone 4", "Apple iPhone 4 Black 32GB Mobile Phone - NEW - Unlocked",
"iPhone 4 features a 5 megapixel autofocus camera with a 5x digital zoom, a backside illuminated sensor and built-in LED flash that allows you to take amazing pictures even in low light and dark environments. iPhone 4 lets you record and edit incredible HD video and the popular tap to focus feature now works while recording video. You can use the iPhone 4‘s LED flash for both still photography and video recording. The iMovie® app for iPhone lets you combine movie clips, add dynamic transitions and themes and include photos and music, and users can buy it through the App Store right on their phone. The iPhone 4 includes Multitasking, Folders, enhanced Mail, deeper Enterprise support and Apple’s iAd mobile advertising platform. With Multitasking, users can now instantly switch between any of their apps while preserving battery life. With Folders, users can easily organize their apps into collections by simply dragging one app on top of another.",
859.00, NULL, 5, NULL);

INSERT INTO items (id, celebrations, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (6, "Birthday", "Birthday Cake", "Wiggles Birthday cake to make your kid feel special",
"For that special occasion you only want the best. This cake is for your 'Little Wiggle' who would love the mouthwatering white chocolate cake with the lovely topping featuring the Wiggles in their big red car. Specially crafted to the highest quality at a reasonable price.",
200.00, NULL, 0, NULL);

INSERT INTO items (id, celebrations, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (7, "Birthday", "Flower Bouquet & Vase", "Surprise your loved ones with flowers",
"Basket of mixed flowers to make the birthday girl feel really special. Surprise your loved one with the gift that she would love.",
50.00, 10.00, 5, 3);

INSERT INTO items (id, celebrations, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (8, "Christmas", "Christmas Tree", "Delux quality Christmas Tree for home or office",
"Deluxe green Majestic Pine Traditional Christmas Tree with metal hinged branches. Green Metal Stand. Bulky item. Size: 3.00 metres high.",
300.00, 20.00, 5, 3);

INSERT INTO items (id, celebrations, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (9, "Christmas", "Christmas Trees", "Delux quality Christmas Trees for home or office",
"Deluxe green Majestic Pine Traditional Christmas Trees with metal hinged branches. Green Metal Stand. Bulky item. Size: 2.1 meters high",
500.00, 50.00, 5, 3);

INSERT INTO items (id, celebrations, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (10, "Christmas", "Christmas Decoration", "Silver Jewel Ball Decoration for your Christmas tree",
"Silver acrylic ball with diamontes and silver glitter hand painted decoration. Size: 80mm diameter",
10.00, 2.00, 5, 3);

INSERT INTO items (id, celebrations, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (11, "Christmas", "Christmas Decoration", "Silver & Blue Ball Decoration for your Christmas tree",
"Silver & Blue acrylic ball with diamontes and colored glitter hand painted decoration. Size: 80mm diameter",
10.00, 2.00, 5, 3);

INSERT INTO items (id, celebrations, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (12, "Corporate", "Compendium", "Diary/Organize r/Compendium for office use",
"Smooth leather-looking exterior with loop closure. Available in black & comes complete with mouse pad, note & card pockets, pen holder & lined notepad.",
20.00, 2.00, 5, 3);

INSERT INTO items (id, celebrations, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (13, "Corporate", "Mouse Pad", "Basic Mouse Pad",
"Thin, hard surface offers improved tracking and responsiveness. Non-skid rubber base protects desktops from scuffs and scratches. Durable polyester construction. Size: 239 x 190 mm",
7.00, 2.00, 5, 3);

INSERT INTO items (id, celebrations, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (14, "Corporate", "Mug", "Classic Coffee Mug",
"Perfect for home or office, the coffee mug is microwave and dishwasher safe.",
7.00, 1.00, 5, 3);

INSERT INTO items (id, celebrations, name, description, details, buy, hire, stock_buy, stock_hire)
VALUES (15, "Corporate", "Pen", "Classic Pen",
"Quality pens at an affordable price. Nib Size 1.0mm. Pack of 50",
25.00, NULL, 5, NULL);






