
-- 메뉴 불러오기

select rownum, bm_idNum, bm_name,bm_lev, bm_step, bm_ref, bm_isDel from blogMenu order by rownum asc;
