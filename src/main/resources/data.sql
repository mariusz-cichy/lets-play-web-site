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
