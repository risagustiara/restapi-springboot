INSERT INTO PRODUCT_CATEGORIES(CATEGORY_ID, CATEGORY_NAME)
  WITH categories AS (
    SELECT 1,'Alat Kesehatan' FROM DUAL UNION ALL
    SELECT 2,'Suplemen' FROM DUAL UNION ALL
    SELECT 3,'Demam' FROM DUAL UNION ALL
    SELECT 4,'Flu/Batuk' FROM DUAL UNION ALL
    SELECT 5,'Pereda Nyeri' FROM DUAL UNION ALL
    SELECT 6,'Lambung/Maag' FROM DUAL UNION ALL
    SELECT 7,'P3K' FROM DUAL
    )
    SELECT * FROM categories;
COMMIT;

select * from product_categories;