    void solve(){



    int n = ni();
    int a[] = na(n);

        int q1[] = new int[n];
        int d[] = new int[n];
        Arrays.fill(d,n+2);

        List<Integer> from[] = new List[n];
        for (int i = 0; i < n; ++i) {
            from[i] = new ArrayList<>();
        }

        for(int u=0;u<2;++u) {
            int s = 0;
            int e = 0;

            for (int i = 0; i < n; ++i) {
                if (a[i] % 2 == u) {
                    int ck1 = a[i] + i;

                    if (ck1 < n ){
                        if(a[ck1] % 2 == 1-u) {
                            d[i] = 1;
                        }else{
                            from[ck1].add(i);
                        }
                    }
                    int ck2 = i - a[i];
                    if (ck2 >= 0 ) {
                        if(a[ck2] % 2 == 1-u) {
                            d[i] = 1;
                        }else{
                            from[ck2].add(i);
                        }
                    }
                    q1[e++] = i;
                }
            }

            while (s < e) {
                int c = q1[s++];
                for(int ck1:from[c]) {
                    if (d[ck1] > d[c] + 1) {
                        q1[e++] = ck1;
                        d[ck1] = d[c] + 1;
                    }
                }
            }
        }
        for(int i=0;i<n;++i){
            if(d[i]==n+2){
                d[i] = -1;
            }
        }
        printArray(d,0);


















    }