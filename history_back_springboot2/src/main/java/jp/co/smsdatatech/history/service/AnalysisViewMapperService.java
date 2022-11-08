package jp.co.smsdatatech.history.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.smsdatatech.history.entity.AnalysisViewEntity;
import jp.co.smsdatatech.history.repository.AnalysisViewMapper;

/**
 *分析画面サービス
 */
@Service
public class AnalysisViewMapperService {
	
	@Autowired
	AnalysisViewMapper analysisViewMapper;
	
	/**
	 * analysis_viewからイベントIDが一致するデータを時間の昇順で取得
	 * @param eventId イベントID
	 * @return ArrayList<AnalysisViewEntity> 検索結果
	 */
	public ArrayList<AnalysisViewEntity> selectEvent(int eventId){
		return analysisViewMapper.selectEvent(eventId);
	}
}
