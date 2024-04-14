ALTER TABLE ${schema_name}.table_name
    ADD CONSTRAINT status_check CHECK (status in ('A', 'B'));