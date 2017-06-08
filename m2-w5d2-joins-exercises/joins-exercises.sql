-- The following queries utilize the "dvdstore" database.

        DONE-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
SELECT film.title, actor.first_name, actor.last_name
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id         -- ON = how are they joined (references chart)
JOIN film ON film_actor.film_id = film.film_id
WHERE actor.first_name = 'NICK' AND actor.last_name = 'STALLONE'

        DONE-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
SELECT film.title, actor.first_name, actor.laast_name
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
WHERE actor.first_name ='RITA' AND actor.last_name = 'REYNOLDS'

        DONE-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
SELECT film.title, actor.first_name, actor.last_name
FROM actor
JOIN film_actor ON actor.actor_id = film_actor.actor_id
JOIN film ON film_actor.film_id = film.film_id
WHERE actor.first_name = 'JUDY' AND actor.last_name = 'DEAN' 
OR actor.first_name = 'RIVER' AND actor.last_name = 'DEAN'

        DONE-- 4. All of the the ‘Documentary’ films
-- (68 rows)
SELECT film.title 
FROM   film
JOIN   film_category ON film.film_id = film_category.film_id
JOIN   category ON film_category.category_id = category.category_id
WHERE  category.name = 'Documentary'

        DONE-- 5. All of the ‘Comedy’ films
-- (58 rows)
SELECT film.title
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Documentary'

        DONE-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
SELECT title, rating
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Children' AND film.rating = 'G'

        DONE-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)
SELECT title, rating, length
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Family' AND film.rating = 'G' AND length < 120


        ?-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)
SELECT actor.actor_id, film.rating
FROM film
JOIN film_actor ON film.film_id = film_actor.film_id
JOIN actor ON film.actor_id = actor.actor_id 
WHERE actor.first_name = 'Matthew' AND actor.last_name = 'Leigh' AND film.rating = 'G'

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
SELECT film.title, category.name, film.release_year
FROM film 
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Sci-Fi' AND film.release_year = '2006'

        ?-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
SELECT film.title, category.name, actor.first_name, actor.last_name
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN film_actor ON film.film_id = film_actor.actor_id
JOIN category ON film_category.film_id = category.category_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE category.category_id  = '1' AND actor.first_name = 'Nick' AND actor.last_name = 'Stallone'

        DONE-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)
SELECT address.address, address.district, city.city, country.country_id
FROM address
JOIN city ON address.city_id = city.city_id
JOIN country ON city.country_id = country.country_id


        ?-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)
SELECT store.store_id, address.address, staff.first_name, staff.last_name
FROM store
JOIN staff ON store.store_id = staff.store_id
JOIN address ON store.address_id = address.address_id
WHERE store.manger_staff_id = staff.first_name  AND address.address_id = 'address' AND staff.staff_id =' 1' AND staff.staff_id = '2'

SELECT store.store_id, 

        ?-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)
SELECT customer.first_name, customer.last_name, rental.rental_id, inventory_id
FROM rental
JOIN customer ON rental.customer_id = customer.customer_id


-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)
SELECT customer.first_name, customer.last_name, SUM(payment.amount)
FROM customer 
JOIN payment ON customer.customer_id = payment.customer_id
WHERE payment.amount 

SELECT AVG (*) payment.amount
FROM payment
JOIN customer ON payment.customer_id = customer.customer_id


-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)

-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)
