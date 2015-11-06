
/**
 * Created by MSI on 2015/11/6.
 */
    package com.jude.prisoner;
     import com.jude.Manger;

    public class SimilarMangermode implements Prisoner {
        int totalCount;
        int totalPerson;

        @Override
        public String getName() {
            return "吴潇2015213186";
        }

        @Override
        public void begin(Manager manager,int totalPerson, int totalCount) {
            this.totalCount = totalCount;
            this.totalPerson = totalPerson;
        }

        @Override
        public int take(int index, int last) {
            int average=totalCount/totalPerson;
            int lastaverage=(totalCount-last)/index;
            //谁会死？
            if(index==0)
            {
                return average;
            }
            else if(index==1)
                return (totalCount-last-1);
            else
                return (totalCount -last)/index;
        }

        @Override
        public void result(boolean survived) {
        }
    }
}
