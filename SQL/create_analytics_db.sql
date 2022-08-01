CREATE TABLE
  public.api_analytics (
    id serial NOT NULL,
    created_at timestamp without time zone NOT NULL DEFAULT now(),
    searched_query character varying(255) NULL
  );

ALTER TABLE
  public.api_analytics
ADD
  CONSTRAINT api_analytics_pkey PRIMARY KEY (id)