ALTER TABLE image
ADD CONSTRAINT fk_image_souvenir FOREIGN KEY (souvenir_id) REFERENCES souvenir(id) ON DELETE CASCADE;
