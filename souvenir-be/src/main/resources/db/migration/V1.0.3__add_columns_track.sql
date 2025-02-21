ALTER TABLE "user" ADD COLUMN created_at DATE;
ALTER TABLE "user" ADD COLUMN last_updated_at TIMESTAMP;

ALTER TABLE souvenir ADD COLUMN created_at DATE;
ALTER TABLE souvenir ADD COLUMN last_updated_at TIMESTAMP;

ALTER TABLE image ADD COLUMN created_at DATE;
ALTER TABLE image ADD COLUMN last_updated_at TIMESTAMP;

