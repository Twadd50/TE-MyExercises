-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**
               
               
                Finish 5  /  Fix category table?

        DONE-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor (first_name, last_name) VALUES ('Lisa', 'Byway');
INSERT INTO actor (first_name, last_name) VALUES ('Hampton', 'Avenue');

        DONE-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	

INSERT INTO film (title, description, release_year, language_id) 
VALUES ('Euclidean PI', '"The epic story of Euclid as a pizza delivery boy in ancient Greece"', '2008', '1')

        DONE-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
INSERT INTO actor (first_name, last_name) VALUES ('Hampton','Avenue');
INSERT INTO actor (first_name, last_name) VALUES ('Lisa','Byway');

        DONE -- 4. Add Mathmagical to the category table.
INSERT INTO category (category_id, name)
VALUES ('17', 'Mathmagical')

       ???? -- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
UPDATE category
SET    name = 'Mathmagical'
FROM   film
WHERE  title = 'Euclidean PI', 'EGG IGBY'

 '494', '714', '996'
 
        DONE-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)
UPDATE film
SET rating = 'G'
FROM category
WHERE category_id = '17'



        DONE-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory (film_id, store_id)  VALUES (1006, 1),(1006, 2);


        DONE-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
DELETE FROM film
WHERE title = 'Euclidean PI'

Yes. I made sure to check Euclidean by searching for it and then deleting it. 
Euclidean PI is no longer listed in the film table


        DONE-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
DELETE FROM category
WHERE name = 'Mathmagical'

Yes. I limited rows in category to Mathmagical by using SELECT * FROM to make sure only that row was being deleted.
The row was removed

        DONE-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
DELETE FROM film_category
WHERE category_id = '17'

 Command processed. No rows were affected.The Mathmagical category was deleted in problem 9

        DONE-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)
DELETE FROM category
WHERE name = 'Mathmagical'
Command processed. No rows were affected

SELECT * FROM film 
WHERE title = 'Euclidean PI'



      DONE-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

These are the tables that have a foreign key constraints
-Film_actor 
-film_category
-inventory

All references to film_id "Eucledian PI" need to be deleted from the above tables before "Eucledian PI" can be deleted from the film_table.











