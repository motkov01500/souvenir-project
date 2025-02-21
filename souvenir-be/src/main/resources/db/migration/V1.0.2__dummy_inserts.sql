INSERT INTO "user" (username, password, email, first_name,last_name)
VALUES ('admin', '$2a$12$MqdfoLevde3XDVqo9uEnkeK3OAUCIRenIhuti4fpTmSR9zPAhiNoS', 'v6zw0@edny.net', 'Peter', 'Petrov'),
       ('liubaka', '$2a$12$MqdfoLevde3XDVqo9uEnkeK3OAUCIRenIhuti4fpTmSR9zPAhiNoS', 'b6bjt@edny.net', 'Lyubo', 'Motkov'),
       ('Test', '$2a$12$MqdfoLevde3XDVqo9uEnkeK3OAUCIRenIhuti4fpTmSR9zPAhiNoS', 'noaf4@edny.net', 'Test', 'Testov');

INSERT INTO souvenir(name, description, price)
VALUES ('test1', 'asdadasdasdasdadadasda', 10.52),
       ('test2', 'asdadasdasdasdadadasda', 11.75),
       ('test3', 'asdadasdasdasdadadasda', 12.25);

INSERT INTO image(image_data, souvenir_id)
VALUES ('$2a$12$QmfznLTYW0MNCZIcnh9db.taZpXwjvzEILb9eqSbMDOcX6dbnTzxu', 1),
       ('$2a$12$QmfznLTYW0MNCZIcnh9db.taZpXwjvzEILb9eqSbMDOcX6dbnTzxu', 2),
       ('$2a$12$QmfznLTYW0MNCZIcnh9db.taZpXwjvzEILb9eqSbMDOcX6dbnTzxu', 3);
